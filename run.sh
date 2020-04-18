function removeDocker(){
    dockerPs=`sudo docker ps | grep -w $1 | head -n 1 | awk '{print $1}'`
    if [ "$dockerPs" != "" ];then
       sudo docker stop $dockerPs
       if [ $? -eq 0 ];then
          echo "$dockerPs stop"
       fi
    fi

    dockerPsAll=`sudo docker ps -a | grep -w $1 | head -n 1 | awk '{print $1}'`
    if [ "$dockerPsAll" != "" ];then
       sudo docker rm $dockerPsAll
       if [ $? -eq 0 ];then
          echo "$dockerPsAll remove"
       fi
    fi

    image=`sudo docker images | grep -w $1 | head -n 1 | awk '{print $3}'`
    if [ "$image" != "" ] ;then
       sudo docker rmi $image
       if [ $? -eq 0 ];then
          echo "$image remove"
       fi
    fi
}

function startDocker(){
  image=`sudo docker images | grep -w $1 | head -n 1 | awk '{print $3}'`

  #启动容器
  sudo docker run -itd --name $1 -p $2:$2 $image

  if [ $? -eq 0 ];then
        echo "$1 容器已启动"
  fi
}

if [ $MANAGE_CMS == true ];then
  removeDocker manage_cms
  if [ $? -eq 0 ];then
    sudo docker build -t manage_cms:$VERSION -f xc-service-manage-cms/config/dockerfile .
    if [ $? -eq 0 ];then
      startDocker manage_cms 31001
    else
      echo "manage_cms build fail"
    fi
  fi
fi

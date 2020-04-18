
if [ $MANAGE_CMS == true ];then
  sudo docker build -t manage_cms:$VERSION -f xc-service-manage-cms/config/dockerfile .
else
  echo " not build manage_cms ...."
fi
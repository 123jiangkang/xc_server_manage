
if [$MANAGE_CMS];then
  docker build -t manage_cms:$VERSION /xc-service-manage-cms/config
else
  echo " not build manage_cms ...."
fi
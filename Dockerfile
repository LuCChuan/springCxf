# Using a comp一个springboot项目的dockerfile怎么写act OS
FROM daocloud.io/nginx:1.11-alpine


EXPOSE 80

CMD sed -i "s/ContainerID: /ContainerID: "$(hostname)"/g" && nginx -g "daemon off;"

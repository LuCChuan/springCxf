# Using a compact OS
FROM daocloud.io/nginx:1.11-alpine

MAINTAINER Golfen Guo <golfen.guo@daocloud.io>

EXPOSE 80

CMD sed -i "s/ContainerID: /ContainerID: "$(hostname)"/g" /springCxf && nginx -g "daemon off;"

FROM skyscraper-docker-local.artifactory.eng.vmware.com/vmc-base-photon:1.1

MAINTAINER VMWARE SKYSCRAPER TEAM

COPY build/libs/jenkinssample-0.1.0.jar /opt/jenkinssample/
COPY entrypoint.sh /opt/jenkinssample/

RUN chmod +x /opt/jenkinssample/*

EXPOSE 9000

ENTRYPOINT ["/opt/jenkinssample/entrypoint.sh"]

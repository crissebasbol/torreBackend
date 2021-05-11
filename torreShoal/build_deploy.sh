export SERVICE_NAME_ENV=back
export SERVICE_ROUTE_ENV=/opt/services/torreBackend/torreShoal
export BRANCH_NAME_ENV=master
export GIT_FETCH_ENV=false
export INTERN_PORT=8081
export PORT=8081
export SERVER_DEPLOYMENT=production
cd /opt/services/torreFront/ng-torre-front
./deploy.sh


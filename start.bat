@echo off
echo Starting port forwarding...

:: delete all kubernetes cluster
kubectl delete all --all

:: apply the Kustomization.yaml
kubectl apply -k .

:: Port forwarding for Spring Boot
start cmd /k "timeout /t 30 /nobreak && kubectl port-forward service/spring-boot-demo-service 8080:8080"

:: Port forwarding for PostgreSQL
start cmd /k "kubectl port-forward service/postgres-service 5432:5432"

:: Port forwarding for Prometheus
start cmd /k "kubectl port-forward service/prometheus 9090:9090"

:: Port forwarding for Grafana
start cmd /k "kubectl port-forward service/grafana 3000:3000"

echo All port forwarding processes started. Each service will run in its own window.
pause

# 시스템 아키텍처

## 목표

실시간 가상자산 시세 조회 서비스 구축

## 구성

사용자 -> Ingress -> coin-dashboard service -> coin-dashboard pod -> coin-api Service -> coin-api Pod
-> CoinGecko API

## 사용 기술

- Ubuntu
- Docker
- Kubernetes
- Ingress
- HPA

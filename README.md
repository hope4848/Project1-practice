# Project1-practice

## 프로젝트 주제
VMware, Kubernetes 기반 가상자산 시세 조회 인프라 구축

## 프로젝트 목표
VMware 기반 Ubuntu 가상머신 위에 Docker와 Kubernetes 환경을 구성하고,
가상자산 시세 조회 어플리케이션을 컨테이너화하여 Kubernetes에 배포한다.

## 핵심 구성
 - VMware 기반 가상 머신 구성
 - Ubuntu Linux 서버 환경 설정 
 - Docker 이미지 빌드
 - Kubernetes Deployment / Service / Ingress 구성
 - HPA 기반 자동 확장 실습
 - 트러블슈팅 기록


## 아키텍처 초안

사용자
-> Ingress 또는 NodePort
-> Service
-> Deployment
-> Pod
-> Coin Price Application
-> External Crypto Price API

## 디렉토리 구조

app/ 어플리케이션 코드
docker/ Dockerfile
k8s/ Kubernetes manifest
scripts/ 설치 및 실행 스크립트
docs/ 아키텍처 및 트러블슈팅 문
=======
# Project1-practice

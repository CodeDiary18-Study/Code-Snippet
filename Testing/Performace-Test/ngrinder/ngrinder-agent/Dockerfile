FROM openjdk:11-slim

RUN apt-get update && apt-get install -y tar && rm -rf /var/lib/apt/lists/*

# tar 파일 복사 및 압축 해제
COPY ./agent.tar /home/
RUN tar -xf /home/agent.tar -C /home/ && rm /home/agent.tar

CMD /home/ngrinder-agent/run_agent.sh -ch controller

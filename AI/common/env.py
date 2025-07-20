import os

from dotenv import load_dotenv

load_dotenv()


class LangSmithEnv:
    LANGSMITH_TRACING = os.getenv("LANGSMITH_TRACING")
    LANGSMITH_ENDPOINT = os.getenv("LANGSMITH_ENDPOINT")
    LANGSMITH_API_KEY = os.getenv("LANGSMITH_API_KEY")
    LANGSMITH_PROJECT = os.getenv("LANGSMITH_PROJECT")
    OPENAI_API_KEY = os.getenv("OPENAI_API_KEY")

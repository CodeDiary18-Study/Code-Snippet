from langsmith import Client

from common import LangSmithEnv


class LangSmithClient(Client):
    def __init__(self):
        super().__init__(
            api_key=LangSmithEnv.LANGSMITH_API_KEY,
            api_url=LangSmithEnv.LANGSMITH_ENDPOINT,
        )

    def connect_check(self):
        try:
            self.list_projects(limit=1)
            print("✅ Success to connect to LangSmith!")
        except Exception as e:
            raise ConnectionError(f"❌ Failed to connect to LangSmith: {e}")


if __name__ == "__main__":
    client = LangSmithClient()
    client.connect_check()

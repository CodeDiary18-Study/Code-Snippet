#!/bin/bash

echo "✨ Formatting code with black..."
black .
echo "🌈 Sorting imports with isort..."
isort .
echo "🛠️ Fixing code with autoflake..."
autoflake --in-place --recursive . --remove-all-unused-imports --remove-unused-variables
echo "✅ Done!"

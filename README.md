# Java 11 Project Template for Snowflake

Use this project template to start writing Java 11 applications on Snowflake.

## Start Here

First, set your accoutn URL, username, role, database, and schema in [app.properties](src/main/resources/app.properties).

Next, set an environment variable with your Snowflake password:

```bash
# Linux/MacOS
set SNOWFLAKE_PASSWORD=<your-password>
```

```PowerShell
# Windows
$env:SNOWFLAKE_PASSWORD = <your-password>
```

## Project Structure

- [procedure/](src/main/java/com/snowflake/procedure/): Your stored procedures
- [udf/](src/main/java/com/snowflake/udf/): Your user-defined functions
- [deploy.yml](.github/workflows/deploy.yaml): Deploys your Java procs and UDFs

## Docs

- [Snowpark JavaDoc](https://docs.snowflake.com/developer-guide/snowpark/reference/java/index.html)
- [Developer Guide](https://docs.snowflake.com/developer-guide/snowpark/java/index.html)
  - [Writing Stored Procedures](https://docs.snowflake.com/en/sql-reference/stored-procedures-java.html) ... This isn't linked in the dev guide?

## NOTES

* The endpoint is `/time` method: `POST`
* The service expect the body to be like 
```bash
{
  "hour": "23:43:00", # Hour String in 24 hours format HH:MM:SS
  "diff": 1 # UTC diff, in this case is UTC+1, if you want for example UTC-3 then diff must be -3
}
```
* The output is:
```bash
{
  "response":
    {
    "time":"22:43:00", # Hour converted to UTC
    "timezone":"utc"
    }
}
```
* The app is deployed on `https://spring-boot-utc-converter.herokuapp.com/` you can test with Postman anytime
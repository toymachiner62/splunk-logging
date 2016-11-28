# cc-libs-util
> Utility library

### Install

```xml
<dependency>
  <groupId>edu.ccs</groupId>
  <artifactId>util</artifactId>
  <version>1.1.0</version>
</dependency>
```

## Logging
This is a logging wrapper that takes care of all the configuration. **STDOUT logs debug and lower** while **<app>.log logs info and lower**.

### Usage

```java
Logger logger = LogFactory.getLogger(MyClass.class);
logger.debug("I'm logging debug stuff");		// This will log to the console and NOT to <app>.log
logger.info("I'm logging information stuff");	// This will log to the console and NOT to <app>.log
logger.warn("I'm logging warning stuff");		// This will log to the console and to <app>.log
logger.error("I'm logging error stuff");		// This will log to the console and to <app>.log
```


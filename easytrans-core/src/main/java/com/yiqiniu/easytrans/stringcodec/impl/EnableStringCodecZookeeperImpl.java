package com.yiqiniu.easytrans.stringcodec.impl;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

/**
 * 
 * @author xudeyou
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ZookeeperStringCodecConfiguration.class)
public @interface EnableStringCodecZookeeperImpl {

}

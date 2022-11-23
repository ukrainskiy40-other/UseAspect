package ru.ukrainskiy.rnd.useaspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"ru.ukrainskiy.rnd.useaspect"})
@EnableAspectJAutoProxy
public class ProjectConfig {
}

package com.nerdynick.kafka.producer;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class KafkaConsoleDatagenProducer {
    protected static final Options options = new Options();
	static {
        options.addOption(Option.builder("t")
            .argName("topic")
            .longOpt("topic")
            .desc("Topic to write to")
            .hasArg()
            .required()
            .build());

        options.addOption(Option.builder("c")
            .argName("config/file.properties")
            .longOpt("producer.config")
            .desc("Property file to provide to the KafkaProducer instance")
            .hasArgs()
            .build());

        options.addOption(Option.builder("p")
            .argName("property=value")
            .longOpt("property")
            .desc("Individual property to provide to the KafkaProducer instance")
            .hasArgs()
            .valueSeparator()
            .build());
	}
    
    public static void main(String[] args) {

    }
}

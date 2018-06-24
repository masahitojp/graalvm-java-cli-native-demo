import org.apache.commons.cli.*;

class Shell{
    public static void main(String[] args) throws ParseException {

        Options options = new Options();
        final Option messageOpttion = Option.builder("m")
                .required()
                .hasArg()
                .longOpt("message")
                .desc("表示するメッセージ")
                .build();

        final Option countOption = Option.builder("c")
                .hasArg()
                .type(Number.class)
                .longOpt("count")
                .desc("メッセージを表示する回数")
                .build();


        options.addOption(messageOpttion);
        options.addOption(countOption);


        final CommandLineParser cliParser = new DefaultParser();
        try {
            CommandLine cmdLine = cliParser.parse(options, args);

            final int count =  Integer.parseInt(cmdLine.getOptionValue("c", "3"));
            for (int i =0 ; i < count; i++) {
                System.out.println(cmdLine.getOptionValue("m"));
            }
        } catch (final Exception e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("CLITester", options);
        }
    }
}

package chainofresponsibility;

/**
 *
 * @author skuarch
 */
public class DocParser extends Parser {

    public DocParser(Parser succesor) {
    }

    @Override
    public void parse(String fileName) {
        if (canHandleFile(fileName, ".doc")) {
            System.out.println("A doc parser is handling the file " + fileName);
        } else {
            super.parse(fileName);
        }
    }

} // end DocParser

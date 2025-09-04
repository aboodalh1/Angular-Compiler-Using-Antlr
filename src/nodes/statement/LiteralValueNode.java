package nodes.statement;

import nodes.ASTNode;
import nodes.html_node.HtmlNode;

// Node for literal value
public class LiteralValueNode implements ASTNode {
    public String stirngValue;
    public String numValue;
    public String arrayValue;
    public String booleanValue;
    public String identifierValue;
    public ListLiteralNode listLiteralNode;
    public  MapLiteralNode mapLiteralNode;
    public HtmlNode getHtmlNode() {
        return htmlNode;
    }

    public void setHtmlNode(HtmlNode htmlNode) {
        this.htmlNode = htmlNode;
    }

    HtmlNode htmlNode;
    public boolean isNull;

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

    public ListLiteralNode getListLiteralNode() {
        return listLiteralNode;
    }

    public void setListLiteralNode(ListLiteralNode listLiteralNode) {
        this.listLiteralNode = listLiteralNode;
    }

    public String getStirngValue() {
        return stirngValue;
    }

    public void setStirngValue(String stirngValue) {
        this.stirngValue = stirngValue;
    }

    public String getNumValue() {
        return numValue;
    }

    public void setNumValue(String numValue) {
        this.numValue = numValue;
    }

    public String getArrayValue() {
        return arrayValue;
    }

    public void setArrayValue(String arrayValue) {
        this.arrayValue = arrayValue;
    }

    public String getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(String booleanValue) {
        this.booleanValue = booleanValue;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        isNull = aNull;
    }

    public MapLiteralNode getMapLiteralNode() {
        return mapLiteralNode;
    }

    public void setMapLiteralNode(MapLiteralNode mapLiteralNode) {
        this.mapLiteralNode = mapLiteralNode;
    }

    @Override
    public String toString() {
        return "LiteralValueNode{" +
                "stirngValue='" + stirngValue + '\'' +
                ", numValue='" + numValue + '\'' +
                ", arrayValue='" + arrayValue + '\'' +
                ", booleanValue='" + booleanValue + '\'' +
                ", identifierValue='" + identifierValue + '\'' +
                ", listLiteralNode=" + listLiteralNode +
                ", mapLiteralNode=" + mapLiteralNode +
                ", htmlNode=" + htmlNode +
                ", isNull=" + isNull +
                '}';
    }
}
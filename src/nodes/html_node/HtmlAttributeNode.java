package nodes.html_node;

import nodes.ASTNode;
import nodes.html_node.html_content.NgForNode;
import nodes.html_node.html_content.NgIfNode;
import nodes.html_node.html_content.OnChangeNodeAttr;
import nodes.html_node.html_content.OnClickAttrNode;
import nodes.statement.ClassNode;

import java.util.ArrayList;
import java.util.List;

public class HtmlAttributeNode implements ASTNode {
    private String identifierNode;
    private String classNode;
    private List<AccessSufNode> accessSufNode = new ArrayList<AccessSufNode>();
    private  HtmlAttributeValueNode htmlAttributeValueNode;
    private NgIfNode ngIfNode;
    private NgForNode ngForNode;
    private OnChangeNodeAttr onChangeNodeAttr;
    private OnClickAttrNode onClickAttrNode;

    public HtmlAttributeNode(String identifierNode, String classNode, List<AccessSufNode> accessSufNode, HtmlAttributeValueNode htmlAttributeValueNode, NgIfNode ngIfNode, NgForNode ngForNode, OnChangeNodeAttr onChangeNodeAttr, OnClickAttrNode onClickAttrNodel) {
        this.identifierNode = identifierNode;
        this.classNode = classNode;
        this.accessSufNode = accessSufNode;
        this.htmlAttributeValueNode = htmlAttributeValueNode;
        this.ngIfNode = ngIfNode;
        this.ngForNode = ngForNode;
        this.onChangeNodeAttr = onChangeNodeAttr;
        this.onClickAttrNode = onClickAttrNode;
    }

    public HtmlAttributeNode() {
    }


    public String getIdentifierNode() {
        return identifierNode;
    }

    public void setIdentifierNode(String identifierNode) {
        this.identifierNode = identifierNode;
    }

    public String getClassNode() {
        return classNode;
    }

    public void setClassNode(String classNode) {
        this.classNode = classNode;
    }

    public List<AccessSufNode> getAccessSufNode() {
        return accessSufNode;
    }

    public void setAccessSufNode(List<AccessSufNode> accessSufNode) {
        this.accessSufNode = accessSufNode;
    }

    public HtmlAttributeValueNode getHtmlAttributeValueNode() {
        return htmlAttributeValueNode;
    }

    public void setHtmlAttributeValueNode(HtmlAttributeValueNode htmlAttributeValueNode) {
        this.htmlAttributeValueNode = htmlAttributeValueNode;
    }

    public NgIfNode getNgIfNode() {
        return ngIfNode;
    }

    public void setNgIfNode(NgIfNode ngIfNode) {
        this.ngIfNode = ngIfNode;
    }

    public NgForNode getNgForNode() {
        return ngForNode;
    }

    public void setNgForNode(NgForNode ngForNode) {
        this.ngForNode = ngForNode;
    }

    public OnChangeNodeAttr getOnChangeNodeAttr() {
        return onChangeNodeAttr;
    }

    public void setOnChangeNodeAttr(OnChangeNodeAttr onChangeNodeAttr) {
        this.onChangeNodeAttr = onChangeNodeAttr;
    }

    public OnClickAttrNode getOnClickAttrNodel() {
        return onClickAttrNode;
    }

    public void setOnClickAttrNodel(OnClickAttrNode onClickAttrNodel) {
        this.onClickAttrNode = onClickAttrNodel;
    }

    @Override
    public String toString() {
        return "HtmlAttributeNode{" +
                "identifierNode='" + identifierNode + '\'' +
                ", classNode='" + classNode + '\'' +
                ", accessSufNode=" + accessSufNode +
                ", htmlAttributeValueNode=" + htmlAttributeValueNode +
                ", ngIfNode=" + ngIfNode +
                ", ngForNode=" + ngForNode +
                ", onChangeNodeAttr=" + onChangeNodeAttr +
                ", onClickAttrNodel=" + onClickAttrNode +
                '}';
    }
}

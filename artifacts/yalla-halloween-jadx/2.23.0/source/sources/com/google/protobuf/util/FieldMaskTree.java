package com.google.protobuf.util;

import com.google.common.base.OooOOO;
import com.google.common.base.Oooo0;
import com.google.common.base.o000oOoO;
import com.google.common.base.o0OO00O;
import com.google.common.base.o0Oo0oo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
final class FieldMaskTree {
    private static final String FIELD_PATH_SEPARATOR_REGEX = "\\.";
    private static final Logger logger = Logger.getLogger(FieldMaskTree.class.getName());
    private final Node root = new Node();

    public static final class Node {
        final SortedMap<String, Node> children;

        private Node() {
            this.children = new TreeMap();
        }
    }

    public FieldMaskTree() {
    }

    private static void getFieldPaths(Node node, String str, List<String> list) {
        String string;
        if (node.children.isEmpty()) {
            list.add(str);
            return;
        }
        for (Map.Entry<String, Node> entry : node.children.entrySet()) {
            if (str.isEmpty()) {
                string = entry.getKey();
            } else {
                StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(str, ".");
                sbOooO0O0.append(entry.getKey());
                string = sbOooO0O0.toString();
            }
            getFieldPaths(entry.getValue(), string, list);
        }
    }

    @CanIgnoreReturnValue
    public FieldMaskTree addFieldPath(String str) {
        String[] strArrSplit = str.split(FIELD_PATH_SEPARATOR_REGEX);
        if (strArrSplit.length == 0) {
            return this;
        }
        Node node = this.root;
        boolean z = false;
        for (String str2 : strArrSplit) {
            if (!z && node != this.root && node.children.isEmpty()) {
                return this;
            }
            if (node.children.containsKey(str2)) {
                node = node.children.get(str2);
            } else {
                Node node2 = new Node();
                node.children.put(str2, node2);
                z = true;
                node = node2;
            }
        }
        node.children.clear();
        return this;
    }

    public void intersectFieldPath(String str, FieldMaskTree fieldMaskTree) {
        if (this.root.children.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split(FIELD_PATH_SEPARATOR_REGEX);
        if (strArrSplit.length == 0) {
            return;
        }
        Node node = this.root;
        for (String str2 : strArrSplit) {
            if (node != this.root && node.children.isEmpty()) {
                fieldMaskTree.addFieldPath(str);
                return;
            } else {
                if (!node.children.containsKey(str2)) {
                    return;
                }
                node = node.children.get(str2);
            }
        }
        ArrayList arrayList = new ArrayList();
        getFieldPaths(node, str, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fieldMaskTree.addFieldPath((String) it.next());
        }
    }

    public void merge(Message message, Message.Builder builder, FieldMaskUtil.MergeOptions mergeOptions) {
        if (message.getDescriptorForType() != builder.getDescriptorForType()) {
            throw new IllegalArgumentException("Cannot merge messages of different types.");
        }
        if (this.root.children.isEmpty()) {
            return;
        }
        merge(this.root, "", message, builder, mergeOptions);
    }

    @CanIgnoreReturnValue
    public FieldMaskTree mergeFromFieldMask(FieldMask fieldMask) {
        Iterator<String> it = fieldMask.getPathsList().iterator();
        while (it.hasNext()) {
            addFieldPath(it.next());
        }
        return this;
    }

    @CanIgnoreReturnValue
    public FieldMaskTree removeFieldPath(String str) {
        Oooo0.f19083OooO00o.getClass();
        OooOOO oooOOO = new OooOOO(Pattern.compile(FIELD_PATH_SEPARATOR_REGEX));
        Matcher matcher = oooOOO.f19072OooO0Oo.matcher("");
        matcher.getClass();
        o000oOoO.OooO0o(!matcher.matches(), "The pattern may not match the empty string: %s", oooOOO);
        List<String> listOooO00o = new o0OO00O(new o0Oo0oo(oooOOO)).OooO00o(str);
        if (listOooO00o.isEmpty()) {
            return this;
        }
        removeFieldPath(this.root, listOooO00o, 0);
        return this;
    }

    @CanIgnoreReturnValue
    public FieldMaskTree removeFromFieldMask(FieldMask fieldMask) {
        Iterator<String> it = fieldMask.getPathsList().iterator();
        while (it.hasNext()) {
            removeFieldPath(it.next());
        }
        return this;
    }

    public FieldMask toFieldMask() {
        if (this.root.children.isEmpty()) {
            return FieldMask.getDefaultInstance();
        }
        ArrayList arrayList = new ArrayList();
        getFieldPaths(this.root, "", arrayList);
        return FieldMask.newBuilder().addAllPaths(arrayList).build();
    }

    public String toString() {
        return FieldMaskUtil.toString(toFieldMask());
    }

    public FieldMaskTree(FieldMask fieldMask) {
        mergeFromFieldMask(fieldMask);
    }

    private static void merge(Node node, String str, Message message, Message.Builder builder, FieldMaskUtil.MergeOptions mergeOptions) {
        String string;
        if (message.getDescriptorForType() == builder.getDescriptorForType()) {
            Descriptors.Descriptor descriptorForType = message.getDescriptorForType();
            for (Map.Entry<String, Node> entry : node.children.entrySet()) {
                Descriptors.FieldDescriptor fieldDescriptorFindFieldByName = descriptorForType.findFieldByName(entry.getKey());
                if (fieldDescriptorFindFieldByName == null) {
                    logger.warning("Cannot find field \"" + entry.getKey() + "\" in message type " + descriptorForType.getFullName());
                } else if (!entry.getValue().children.isEmpty()) {
                    if (!fieldDescriptorFindFieldByName.isRepeated() && fieldDescriptorFindFieldByName.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                        if (message.hasField(fieldDescriptorFindFieldByName) || builder.hasField(fieldDescriptorFindFieldByName)) {
                            if (str.isEmpty()) {
                                string = entry.getKey();
                            } else {
                                StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(str, ".");
                                sbOooO0O0.append(entry.getKey());
                                string = sbOooO0O0.toString();
                            }
                            Message.Builder builder2 = ((Message) builder.getField(fieldDescriptorFindFieldByName)).toBuilder();
                            merge(entry.getValue(), string, (Message) message.getField(fieldDescriptorFindFieldByName), builder2, mergeOptions);
                            builder.setField(fieldDescriptorFindFieldByName, builder2.buildPartial());
                        }
                    } else {
                        logger.warning("Field \"" + fieldDescriptorFindFieldByName.getFullName() + "\" is not a singular message field and cannot have sub-fields.");
                    }
                } else if (fieldDescriptorFindFieldByName.isRepeated()) {
                    if (mergeOptions.replaceRepeatedFields()) {
                        builder.setField(fieldDescriptorFindFieldByName, message.getField(fieldDescriptorFindFieldByName));
                    } else {
                        Iterator it = ((List) message.getField(fieldDescriptorFindFieldByName)).iterator();
                        while (it.hasNext()) {
                            builder.addRepeatedField(fieldDescriptorFindFieldByName, it.next());
                        }
                    }
                } else if (fieldDescriptorFindFieldByName.getJavaType() == Descriptors.FieldDescriptor.JavaType.MESSAGE) {
                    if (mergeOptions.replaceMessageFields()) {
                        if (!message.hasField(fieldDescriptorFindFieldByName)) {
                            builder.clearField(fieldDescriptorFindFieldByName);
                        } else {
                            builder.setField(fieldDescriptorFindFieldByName, message.getField(fieldDescriptorFindFieldByName));
                        }
                    } else if (message.hasField(fieldDescriptorFindFieldByName)) {
                        builder.setField(fieldDescriptorFindFieldByName, ((Message) builder.getField(fieldDescriptorFindFieldByName)).toBuilder().mergeFrom((Message) message.getField(fieldDescriptorFindFieldByName)).build());
                    }
                } else if (!message.hasField(fieldDescriptorFindFieldByName) && mergeOptions.replacePrimitiveFields()) {
                    builder.clearField(fieldDescriptorFindFieldByName);
                } else {
                    builder.setField(fieldDescriptorFindFieldByName, message.getField(fieldDescriptorFindFieldByName));
                }
            }
            return;
        }
        throw new IllegalArgumentException(String.format("source (%s) and destination (%s) descriptor must be equal", message.getDescriptorForType(), builder.getDescriptorForType()));
    }

    @CanIgnoreReturnValue
    private static boolean removeFieldPath(Node node, List<String> list, int i) {
        String str = list.get(i);
        if (!node.children.containsKey(str)) {
            return false;
        }
        if (i == list.size() - 1) {
            node.children.remove(str);
            return node.children.isEmpty();
        }
        if (removeFieldPath(node.children.get(str), list, i + 1)) {
            node.children.remove(str);
        }
        return node.children.isEmpty();
    }
}

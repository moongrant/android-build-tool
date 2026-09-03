package com.google.protobuf.util;

import com.google.common.base.CaseFormat;
import com.google.common.base.OooO;
import com.google.common.base.OooO00o;
import com.google.common.base.OooOo;
import com.google.common.base.Optional;
import com.google.common.base.o00oO0o;
import com.google.common.base.o0OOO0o;
import com.google.common.base.o0OoOo0;
import com.google.common.base.oo0o0Oo;
import com.google.common.primitives.OooO0OO;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.protobuf.Descriptors;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Internal;
import com.google.protobuf.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldMaskUtil {
    private static final String FIELD_PATH_SEPARATOR = ",";
    private static final String FIELD_PATH_SEPARATOR_REGEX = ",";
    private static final String FIELD_SEPARATOR_REGEX = "\\.";

    public static final class MergeOptions {
        private boolean replaceMessageFields = false;
        private boolean replaceRepeatedFields = false;
        private boolean replacePrimitiveFields = false;

        public boolean replaceMessageFields() {
            return this.replaceMessageFields;
        }

        public boolean replacePrimitiveFields() {
            return this.replacePrimitiveFields;
        }

        public boolean replaceRepeatedFields() {
            return this.replaceRepeatedFields;
        }

        @CanIgnoreReturnValue
        public MergeOptions setReplaceMessageFields(boolean z) {
            this.replaceMessageFields = z;
            return this;
        }

        @CanIgnoreReturnValue
        public MergeOptions setReplacePrimitiveFields(boolean z) {
            this.replacePrimitiveFields = z;
            return this;
        }

        @CanIgnoreReturnValue
        public MergeOptions setReplaceRepeatedFields(boolean z) {
            this.replaceRepeatedFields = z;
            return this;
        }
    }

    private FieldMaskUtil() {
    }

    public static FieldMask fromFieldNumbers(Class<? extends Message> cls, Iterable<Integer> iterable) {
        Descriptors.Descriptor descriptorForType = ((Message) Internal.getDefaultInstance(cls)).getDescriptorForType();
        FieldMask.Builder builderNewBuilder = FieldMask.newBuilder();
        for (Integer num : iterable) {
            Descriptors.FieldDescriptor fieldDescriptorFindFieldByNumber = descriptorForType.findFieldByNumber(num.intValue());
            o0OoOo0.OooO0o0(fieldDescriptorFindFieldByNumber != null, String.format("%s is not a valid field number for %s.", num, cls));
            builderNewBuilder.addPaths(fieldDescriptorFindFieldByNumber.getName());
        }
        return builderNewBuilder.build();
    }

    public static FieldMask fromJsonString(String str) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(new o0OOO0o(new OooO.OooO0OO(",".charAt(0))));
        str.getClass();
        FieldMask.Builder builderNewBuilder = FieldMask.newBuilder();
        Iterator<String> itOooO00o = oo0o0oo.f18618OooO0O0.OooO00o(oo0o0oo, str);
        while (itOooO00o.hasNext()) {
            String next = itOooO00o.next();
            if (!next.isEmpty()) {
                CaseFormat caseFormat = CaseFormat.LOWER_CAMEL;
                CaseFormat caseFormat2 = CaseFormat.LOWER_UNDERSCORE;
                caseFormat.getClass();
                caseFormat2.getClass();
                if (caseFormat2 != caseFormat) {
                    next = caseFormat.OooO0O0(caseFormat2, next);
                }
                builderNewBuilder.addPaths(next);
            }
        }
        return builderNewBuilder.build();
    }

    public static FieldMask fromString(String str) {
        return fromStringList(Arrays.asList(str.split(",")));
    }

    public static FieldMask fromStringList(Iterable<String> iterable) {
        return fromStringList(OooO00o.f18586OooO0Oo, iterable);
    }

    public static FieldMask intersection(FieldMask fieldMask, FieldMask fieldMask2) {
        FieldMaskTree fieldMaskTree = new FieldMaskTree(fieldMask);
        FieldMaskTree fieldMaskTree2 = new FieldMaskTree();
        Iterator<String> it = fieldMask2.getPathsList().iterator();
        while (it.hasNext()) {
            fieldMaskTree.intersectFieldPath(it.next(), fieldMaskTree2);
        }
        return fieldMaskTree2.toFieldMask();
    }

    public static boolean isValid(Class<? extends Message> cls, FieldMask fieldMask) {
        return isValid(((Message) Internal.getDefaultInstance(cls)).getDescriptorForType(), fieldMask);
    }

    public static void merge(FieldMask fieldMask, Message message, Message.Builder builder, MergeOptions mergeOptions) {
        new FieldMaskTree(fieldMask).merge(message, builder, mergeOptions);
    }

    public static FieldMask normalize(FieldMask fieldMask) {
        return new FieldMaskTree(fieldMask).toFieldMask();
    }

    public static FieldMask subtract(FieldMask fieldMask, FieldMask fieldMask2, FieldMask... fieldMaskArr) {
        FieldMaskTree fieldMaskTreeRemoveFromFieldMask = new FieldMaskTree(fieldMask).removeFromFieldMask(fieldMask2);
        for (FieldMask fieldMask3 : fieldMaskArr) {
            fieldMaskTreeRemoveFromFieldMask.removeFromFieldMask(fieldMask3);
        }
        return fieldMaskTreeRemoveFromFieldMask.toFieldMask();
    }

    public static String toJsonString(FieldMask fieldMask) {
        ArrayList arrayList = new ArrayList(fieldMask.getPathsCount());
        for (String strOooO0O0 : fieldMask.getPathsList()) {
            if (!strOooO0O0.isEmpty()) {
                CaseFormat caseFormat = CaseFormat.LOWER_UNDERSCORE;
                CaseFormat caseFormat2 = CaseFormat.LOWER_CAMEL;
                caseFormat.getClass();
                caseFormat2.getClass();
                if (caseFormat2 != caseFormat) {
                    strOooO0O0 = caseFormat.OooO0O0(caseFormat2, strOooO0O0);
                }
                arrayList.add(strOooO0O0);
            }
        }
        OooOo oooOo = new OooOo(",");
        Iterator it = arrayList.iterator();
        StringBuilder sb = new StringBuilder();
        oooOo.OooO00o(sb, it);
        return sb.toString();
    }

    public static String toString(FieldMask fieldMask) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str : fieldMask.getPathsList()) {
            if (!str.isEmpty()) {
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static <P extends Message> P trim(FieldMask fieldMask, P p) {
        return (P) trim(fieldMask, p, new MergeOptions());
    }

    public static FieldMask union(FieldMask fieldMask, FieldMask fieldMask2, FieldMask... fieldMaskArr) {
        FieldMaskTree fieldMaskTreeMergeFromFieldMask = new FieldMaskTree(fieldMask).mergeFromFieldMask(fieldMask2);
        for (FieldMask fieldMask3 : fieldMaskArr) {
            fieldMaskTreeMergeFromFieldMask.mergeFromFieldMask(fieldMask3);
        }
        return fieldMaskTreeMergeFromFieldMask.toFieldMask();
    }

    public static FieldMask fromString(Class<? extends Message> cls, String str) {
        return fromStringList(cls, Arrays.asList(str.split(",")));
    }

    public static void merge(FieldMask fieldMask, Message message, Message.Builder builder) {
        merge(fieldMask, message, builder, new MergeOptions());
    }

    public static <P extends Message> P trim(FieldMask fieldMask, P p, MergeOptions mergeOptions) {
        Message.Builder builderNewBuilderForType = p.newBuilderForType();
        merge(fieldMask, p, builderNewBuilderForType, mergeOptions);
        return (P) builderNewBuilderForType.build();
    }

    public static FieldMask fromStringList(Descriptors.Descriptor descriptor, Iterable<String> iterable) {
        descriptor.getClass();
        return fromStringList(new o00oO0o(descriptor), iterable);
    }

    public static boolean isValid(Descriptors.Descriptor descriptor, FieldMask fieldMask) {
        Iterator<String> it = fieldMask.getPathsList().iterator();
        while (it.hasNext()) {
            if (!isValid(descriptor, it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(Class<? extends Message> cls, String str) {
        return isValid(((Message) Internal.getDefaultInstance(cls)).getDescriptorForType(), str);
    }

    public static FieldMask fromStringList(Class<? extends Message> cls, Iterable<String> iterable) {
        return fromStringList(((Message) Internal.getDefaultInstance(cls)).getDescriptorForType(), iterable);
    }

    public static boolean isValid(Descriptors.Descriptor descriptor, String str) {
        Descriptors.FieldDescriptor fieldDescriptorFindFieldByName;
        String[] strArrSplit = str.split(FIELD_SEPARATOR_REGEX);
        if (strArrSplit.length == 0) {
            return false;
        }
        for (String str2 : strArrSplit) {
            if (descriptor == null || (fieldDescriptorFindFieldByName = descriptor.findFieldByName(str2)) == null) {
                return false;
            }
            descriptor = (fieldDescriptorFindFieldByName.isRepeated() || fieldDescriptorFindFieldByName.getJavaType() != Descriptors.FieldDescriptor.JavaType.MESSAGE) ? null : fieldDescriptorFindFieldByName.getMessageType();
        }
        return true;
    }

    private static FieldMask fromStringList(Optional<Descriptors.Descriptor> optional, Iterable<String> iterable) {
        FieldMask.Builder builderNewBuilder = FieldMask.newBuilder();
        for (String str : iterable) {
            if (!str.isEmpty()) {
                if (optional.OooO0O0() && !isValid(optional.OooO00o(), str)) {
                    StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, " is not a valid path for ");
                    sbOooO0O0.append(optional.OooO00o().getFullName());
                    throw new IllegalArgumentException(sbOooO0O0.toString());
                }
                builderNewBuilder.addPaths(str);
            }
        }
        return builderNewBuilder.build();
    }

    public static FieldMask fromFieldNumbers(Class<? extends Message> cls, int... iArr) {
        List oooO00o;
        if (iArr.length == 0) {
            oooO00o = Collections.emptyList();
        } else {
            oooO00o = new OooO0OO.OooO00o(0, iArr.length, iArr);
        }
        return fromFieldNumbers(cls, oooO00o);
    }
}

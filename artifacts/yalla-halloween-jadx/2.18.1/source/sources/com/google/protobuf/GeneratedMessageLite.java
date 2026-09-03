package com.google.protobuf;

import com.app.base.protobuf.MessageIM;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.OooO00o;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends OooO00o<MessageType, BuilderType>> extends com.google.protobuf.OooO00o<MessageType, BuilderType> {
    public o000OOo unknownFields = o000OOo.f19390OooO0o0;
    public int memoizedSerializedSize = -1;

    public enum MethodToInvoke {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static final class OooO implements OooOo.OooO0O0<OooO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f19336Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final WireFormat$FieldType f19337Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final boolean f19338Oooo0oo;

        public OooO(int i, WireFormat$FieldType wireFormat$FieldType, boolean z) {
            this.f19336Oooo0o = i;
            this.f19337Oooo0oO = wireFormat$FieldType;
            this.f19338Oooo0oo = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.OooOo.OooO0O0
        public final oo000o.OooO00o OooO0OO(oo000o.OooO00o oooO00o, oo000o oo000oVar) {
            return ((OooO00o) oooO00o).mergeFrom((GeneratedMessageLite) oo000oVar);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f19336Oooo0o - ((OooO) obj).f19336Oooo0o;
        }

        @Override // com.google.protobuf.OooOo.OooO0O0
        public final WireFormat$JavaType getLiteJavaType() {
            return this.f19337Oooo0oO.OooO00o();
        }

        @Override // com.google.protobuf.OooOo.OooO0O0
        public final WireFormat$FieldType getLiteType() {
            return this.f19337Oooo0oO;
        }

        @Override // com.google.protobuf.OooOo.OooO0O0
        public final boolean isRepeated() {
            return this.f19338Oooo0oo;
        }
    }

    public static abstract class OooO00o<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends OooO00o<MessageType, BuilderType>> extends com.google.protobuf.OooO00o.AbstractC0157OooO00o<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        public MessageType instance;
        public boolean isBuilt = false;

        public OooO00o(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (MessageType) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        public void copyOnWrite() {
            if (this.isBuilt) {
                MessageType messagetype = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                messagetype.visit(OooOOO0.f19347OooO00o, this.instance);
                this.instance = messagetype;
                this.isBuilt = false;
            }
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.oo000o.OooO00o
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw com.google.protobuf.OooO00o.AbstractC0157OooO00o.newUninitializedMessageException(messagetype);
        }

        @Override // com.google.protobuf.oo000o.OooO00o
        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] */
        public final BuilderType m238clear() {
            this.instance = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // com.google.protobuf.o00oO0o
        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        @Override // com.google.protobuf.OooO00o.AbstractC0157OooO00o
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            this.instance.visit(OooOOO0.f19347OooO00o, messagetype);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.OooO00o.AbstractC0157OooO00o
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public BuilderType mo240clone() {
            MessageIM.FriendAddReply.Builder builder = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            builder.mergeFrom(buildPartial());
            return builder;
        }

        @Override // com.google.protobuf.OooO00o.AbstractC0157OooO00o
        /* JADX INFO: renamed from: mergeFrom, reason: merged with bridge method [inline-methods] */
        public BuilderType mo241mergeFrom(com.google.protobuf.OooOO0O oooOO0O, OooOo00 oooOo00) throws IOException {
            copyOnWrite();
            try {
                this.instance.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, oooOO0O, oooOo00);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static class OooO0O0<T extends GeneratedMessageLite<T, ?>> extends com.google.protobuf.OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public T f19339OooO00o;

        public OooO0O0(T t) {
            this.f19339OooO00o = t;
        }

        @Override // com.google.protobuf.o0OOO0o
        public final Object OooO00o(com.google.protobuf.OooOO0O oooOO0O, OooOo00 oooOo00) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.f19339OooO00o, oooOO0O, oooOo00);
        }
    }

    public static class OooO0OO implements OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f19340OooO00o = new OooO0OO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO00o f19341OooO0O0 = new OooO00o();

        public static final class OooO00o extends RuntimeException {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final boolean OooO(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final <T extends oo000o> T OooO00o(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f19341OooO0O0;
            }
            ((GeneratedMessageLite) t).equals(this, t2);
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final OooOo<OooO> OooO0O0(OooOo<OooO> oooOo, OooOo<OooO> oooOo2) {
            if (oooOo.equals(oooOo2)) {
                return oooOo;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final void OooO0OO(boolean z) {
            if (z) {
                throw f19341OooO0O0;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final int OooO0Oo(boolean z, int i, boolean z2, int i2) {
            if (z == z2 && i == i2) {
                return i;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final String OooO0o(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final o000OOo OooO0o0(o000OOo o000ooo2, o000OOo o000ooo3) {
            if (o000ooo2.equals(o000ooo3)) {
                return o000ooo2;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final Object OooO0oO(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final <T> o000oOoO.OooOOO0<T> OooO0oo(o000oOoO.OooOOO0<T> oooOOO0, o000oOoO.OooOOO0<T> oooOOO1) {
            if (oooOOO0.equals(oooOOO1)) {
                return oooOOO0;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final ByteString OooOO0(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            if (z == z2 && byteString.equals(byteString2)) {
                return byteString;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final long OooOO0O(boolean z, long j, boolean z2, long j2) {
            if (z == z2 && j == j2) {
                return j;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final o000oOoO.OooOO0O OooOO0o(o000oOoO.OooOO0O oooOO0O, o000oOoO.OooOO0O oooOO0O2) {
            if (oooOO0O.equals(oooOO0O2)) {
                return oooOO0O;
            }
            throw f19341OooO0O0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final Object OooOOO0(boolean z, Object obj, Object obj2) {
            if (z && obj.equals(obj2)) {
                return obj;
            }
            throw f19341OooO0O0;
        }
    }

    public static abstract class OooO0o<MessageType extends OooO0o<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements o00oO0o {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public OooOo<OooO> f19342Oooo0o = new OooOo<>();

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.o00oO0o
        public final /* bridge */ /* synthetic */ oo000o getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final void makeImmutable() {
            super.makeImmutable();
            OooOo<OooO> oooOo = this.f19342Oooo0o;
            if (oooOo.f19373OooO0O0) {
                return;
            }
            oooOo.f19372OooO00o.OooO0oo();
            oooOo.f19373OooO0O0 = true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.oo000o
        public final /* bridge */ /* synthetic */ oo000o.OooO00o newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.oo000o
        public final /* bridge */ /* synthetic */ oo000o.OooO00o toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final void visit(OooOOO oooOOO, GeneratedMessageLite generatedMessageLite) {
            OooO0o oooO0o = (OooO0o) generatedMessageLite;
            super.visit(oooOOO, oooO0o);
            this.f19342Oooo0o = oooOOO.OooO0O0(this.f19342Oooo0o, oooO0o.f19342Oooo0o);
        }
    }

    public static class OooOO0<ContainingType extends oo000o, Type> extends com.google.protobuf.OooOOO<ContainingType, Type> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ContainingType f19343OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Type f19344OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final oo000o f19345OooO0OO;

        /* JADX WARN: Multi-variable type inference failed */
        public OooOO0(oo000o oo000oVar, Object obj, oo000o oo000oVar2, OooO oooO) {
            if (oo000oVar == 0) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (oooO.f19337Oooo0oO == WireFormat$FieldType.MESSAGE && oo000oVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f19343OooO00o = oo000oVar;
            this.f19344OooO0O0 = obj;
            this.f19345OooO0OO = oo000oVar2;
        }
    }

    public static class OooOO0O implements OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f19346OooO00o = 0;

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final boolean OooO(boolean z, boolean z2, boolean z3, boolean z4) {
            this.f19346OooO00o = o000oOoO.OooO00o(z2) + (this.f19346OooO00o * 53);
            return z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final <T extends oo000o> T OooO00o(T t, T t2) {
            int iHashCode;
            if (t != null) {
                iHashCode = t instanceof GeneratedMessageLite ? ((GeneratedMessageLite) t).hashCode(this) : t.hashCode();
            } else {
                iHashCode = 37;
            }
            this.f19346OooO00o = (this.f19346OooO00o * 53) + iHashCode;
            return t;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final OooOo<OooO> OooO0O0(OooOo<OooO> oooOo, OooOo<OooO> oooOo2) {
            this.f19346OooO00o = oooOo.hashCode() + (this.f19346OooO00o * 53);
            return oooOo;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final void OooO0OO(boolean z) {
            if (z) {
                throw new IllegalStateException();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final int OooO0Oo(boolean z, int i, boolean z2, int i2) {
            this.f19346OooO00o = (this.f19346OooO00o * 53) + i;
            return i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final String OooO0o(boolean z, String str, boolean z2, String str2) {
            this.f19346OooO00o = str.hashCode() + (this.f19346OooO00o * 53);
            return str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final o000OOo OooO0o0(o000OOo o000ooo2, o000OOo o000ooo3) {
            this.f19346OooO00o = o000ooo2.hashCode() + (this.f19346OooO00o * 53);
            return o000ooo2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final Object OooO0oO(boolean z, Object obj, Object obj2) {
            this.f19346OooO00o = o000oOoO.OooO00o(((Boolean) obj).booleanValue()) + (this.f19346OooO00o * 53);
            return obj;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final <T> o000oOoO.OooOOO0<T> OooO0oo(o000oOoO.OooOOO0<T> oooOOO0, o000oOoO.OooOOO0<T> oooOOO1) {
            this.f19346OooO00o = oooOOO0.hashCode() + (this.f19346OooO00o * 53);
            return oooOOO0;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final ByteString OooOO0(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            this.f19346OooO00o = byteString.hashCode() + (this.f19346OooO00o * 53);
            return byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final long OooOO0O(boolean z, long j, boolean z2, long j2) {
            this.f19346OooO00o = o000oOoO.OooO0O0(j) + (this.f19346OooO00o * 53);
            return j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final o000oOoO.OooOO0O OooOO0o(o000oOoO.OooOO0O oooOO0O, o000oOoO.OooOO0O oooOO0O2) {
            this.f19346OooO00o = oooOO0O.hashCode() + (this.f19346OooO00o * 53);
            return oooOO0O;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final Object OooOOO0(boolean z, Object obj, Object obj2) {
            this.f19346OooO00o = o000oOoO.OooO0O0(((Long) obj).longValue()) + (this.f19346OooO00o * 53);
            return obj;
        }
    }

    public interface OooOOO {
        boolean OooO(boolean z, boolean z2, boolean z3, boolean z4);

        <T extends oo000o> T OooO00o(T t, T t2);

        OooOo<OooO> OooO0O0(OooOo<OooO> oooOo, OooOo<OooO> oooOo2);

        void OooO0OO(boolean z);

        int OooO0Oo(boolean z, int i, boolean z2, int i2);

        String OooO0o(boolean z, String str, boolean z2, String str2);

        o000OOo OooO0o0(o000OOo o000ooo2, o000OOo o000ooo3);

        Object OooO0oO(boolean z, Object obj, Object obj2);

        <T> o000oOoO.OooOOO0<T> OooO0oo(o000oOoO.OooOOO0<T> oooOOO0, o000oOoO.OooOOO0<T> oooOOO1);

        ByteString OooOO0(boolean z, ByteString byteString, boolean z2, ByteString byteString2);

        long OooOO0O(boolean z, long j, boolean z2, long j2);

        o000oOoO.OooOO0O OooOO0o(o000oOoO.OooOO0O oooOO0O, o000oOoO.OooOO0O oooOO0O2);

        Object OooOOO0(boolean z, Object obj, Object obj2);
    }

    public static class OooOOO0 implements OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooOOO0 f19347OooO00o = new OooOOO0();

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final boolean OooO(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final <T extends oo000o> T OooO00o(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            return (T) t.toBuilder().mergeFrom(t2).build();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final OooOo<OooO> OooO0O0(OooOo<OooO> oooOo, OooOo<OooO> oooOo2) {
            if (oooOo.f19373OooO0O0) {
                oooOo = oooOo.clone();
            }
            for (int i = 0; i < oooOo2.f19372OooO00o.OooO0Oo(); i++) {
                oooOo.OooO0OO(oooOo2.f19372OooO00o.OooO0OO(i));
            }
            Iterator it = oooOo2.f19372OooO00o.OooO0o0().iterator();
            while (it.hasNext()) {
                oooOo.OooO0OO((Map.Entry) it.next());
            }
            return oooOo;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final void OooO0OO(boolean z) {
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final int OooO0Oo(boolean z, int i, boolean z2, int i2) {
            return z2 ? i2 : i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final String OooO0o(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final o000OOo OooO0o0(o000OOo o000ooo2, o000OOo o000ooo3) {
            return o000ooo3 == o000OOo.f19390OooO0o0 ? o000ooo2 : o000OOo.OooO0OO(o000ooo2, o000ooo3);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final Object OooO0oO(boolean z, Object obj, Object obj2) {
            return obj2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final <T> o000oOoO.OooOOO0<T> OooO0oo(o000oOoO.OooOOO0<T> oooOOO0, o000oOoO.OooOOO0<T> oooOOO1) {
            int size = oooOOO0.size();
            int size2 = oooOOO1.size();
            if (size > 0 && size2 > 0) {
                if (!((com.google.protobuf.OooO0OO) oooOOO0).f19351Oooo0o) {
                    oooOOO0 = oooOOO0.OooOoO(size2 + size);
                }
                oooOOO0.addAll(oooOOO1);
            }
            return size > 0 ? oooOOO0 : oooOOO1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final ByteString OooOO0(boolean z, ByteString byteString, boolean z2, ByteString byteString2) {
            return z2 ? byteString2 : byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final long OooOO0O(boolean z, long j, boolean z2, long j2) {
            return z2 ? j2 : j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [com.google.protobuf.o000oOoO$OooOO0O] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v10 */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v1, types: [com.google.protobuf.o000oOoO$OooOO0O] */
        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final o000oOoO.OooOO0O OooOO0o(o000oOoO.OooOO0O oooOO0O, o000oOoO.OooOO0O oooOO0O2) {
            ?? OooO2;
            int i = ((o00Ooo) oooOO0O).f19400Oooo0oo;
            int i2 = ((o00Ooo) oooOO0O2).f19400Oooo0oo;
            ?? r4 = oooOO0O;
            r4 = oooOO0O;
            if (i > 0 && i2 > 0) {
                if (!((com.google.protobuf.OooO0OO) oooOO0O).f19351Oooo0o) {
                    OooO2 = oooOO0O;
                    OooO2 = ((o00Ooo) oooOO0O).OooOoO(i2 + i);
                }
                OooO2 = oooOO0O;
                o00Ooo o00ooo2 = (o00Ooo) OooO2;
                o00ooo2.addAll(oooOO0O2);
                r4 = o00ooo2;
            }
            return i > 0 ? r4 : oooOO0O2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.OooOOO
        public final Object OooOOO0(boolean z, Object obj, Object obj2) {
            return obj2;
        }
    }

    public static final class SerializedForm implements Serializable {
        public Object readResolve() throws ObjectStreamException {
            try {
                try {
                    Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                    declaredField.setAccessible(true);
                    return ((oo000o) declaredField.get(null)).newBuilderForType().mergeFrom((byte[]) null).buildPartial();
                } catch (InvalidProtocolBufferException e) {
                    throw new RuntimeException("Unable to understand proto buffer", e);
                } catch (ClassNotFoundException e2) {
                    throw new RuntimeException("Unable to find proto buffer class: null", e2);
                } catch (IllegalAccessException e3) {
                    throw new RuntimeException("Unable to call parsePartialFrom", e3);
                } catch (NoSuchFieldException unused) {
                    Field declaredField2 = Class.forName(null).getDeclaredField("defaultInstance");
                    declaredField2.setAccessible(true);
                    return ((oo000o) declaredField2.get(null)).newBuilderForType().mergeFrom((byte[]) null).buildPartial();
                } catch (SecurityException e4) {
                    throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e4);
                }
            } catch (InvalidProtocolBufferException e5) {
                throw new RuntimeException("Unable to understand proto buffer", e5);
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException("Unable to find proto buffer class: null", e6);
            } catch (IllegalAccessException e7) {
                throw new RuntimeException("Unable to call parsePartialFrom", e7);
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException("Unable to find defaultInstance in null", e8);
            } catch (SecurityException e9) {
                throw new RuntimeException("Unable to call defaultInstance in null", e9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends OooO0o<MessageType, BuilderType>, BuilderType, T> OooOO0<MessageType, T> checkIsLite(com.google.protobuf.OooOOO<MessageType, T> oooOOO) {
        Objects.requireNonNull(oooOOO);
        return (OooOO0) oooOOO;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = t.newUninitializedMessageException();
        Objects.requireNonNull(uninitializedMessageExceptionNewUninitializedMessageException);
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    public static o000oOoO.OooO00o emptyBooleanList() {
        return com.google.protobuf.OooO0o.f19352Oooo;
    }

    public static o000oOoO.OooO0O0 emptyDoubleList() {
        return com.google.protobuf.OooOOO0.f19368Oooo;
    }

    public static o000oOoO.OooO emptyFloatList() {
        return Oooo000.f19382Oooo;
    }

    public static o000oOoO.OooOO0 emptyIntList() {
        return Oooo0.f19379Oooo;
    }

    public static o000oOoO.OooOO0O emptyLongList() {
        return o00Ooo.f19398Oooo;
    }

    public static <E> o000oOoO.OooOOO0<E> emptyProtobufList() {
        return o0Oo0oo.f19401Oooo0oo;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == o000OOo.f19390OooO0o0) {
            this.unknownFields = new o000OOo();
        }
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Generated message class \"");
            sbOooO0o0.append(cls.getName());
            sbOooO0o0.append("\" missing method \"");
            sbOooO0o0.append(str);
            sbOooO0o0.append("\".");
            throw new RuntimeException(sbOooO0o0.toString(), e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static o000oOoO.OooOO0 mutableCopy(o000oOoO.OooOO0 oooOO1) {
        int i = ((Oooo0) oooOO1).f19381Oooo0oo;
        return ((Oooo0) oooOO1).OooOoO(i == 0 ? 10 : i * 2);
    }

    public static <ContainingType extends oo000o, Type> OooOO0<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, oo000o oo000oVar, o000oOoO.OooO0o<?> oooO0o, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new OooOO0<>(containingtype, Collections.emptyList(), oo000oVar, new OooO(i, wireFormat$FieldType, true));
    }

    public static <ContainingType extends oo000o, Type> OooOO0<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, oo000o oo000oVar, o000oOoO.OooO0o<?> oooO0o, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new OooOO0<>(containingtype, type, oo000oVar, new OooO(i, wireFormat$FieldType, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, OooOo00.OooO00o()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parseFrom(t, byteString, OooOo00.OooO00o()));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            com.google.protobuf.OooOO0O oooOO0OOooO0OO = com.google.protobuf.OooOO0O.OooO0OO(new com.google.protobuf.OooO00o.AbstractC0157OooO00o.C0158OooO00o(inputStream, com.google.protobuf.OooOO0O.OooOOOO(i, inputStream)));
            T t2 = (T) parsePartialFrom(t, oooOO0OOooO0OO, oooOo00);
            try {
                oooOO0OOooO0OO.OooO00o(0);
                return t2;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            }
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        try {
            com.google.protobuf.OooOO0O oooOO0OOooO0Oo = com.google.protobuf.OooOO0O.OooO0Oo(bArr, 0, bArr.length);
            T t2 = (T) parsePartialFrom(t, oooOO0OOooO0Oo, oooOo00);
            try {
                oooOO0OOooO0Oo.OooO00o(0);
                return t2;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        try {
            visit(OooO0OO.f19340OooO00o, (GeneratedMessageLite) obj);
            return true;
        } catch (OooO0OO.OooO00o unused) {
            return false;
        }
    }

    @Override // com.google.protobuf.oo000o
    public final o0OOO0o<MessageType> getParserForType() {
        return (o0OOO0o) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int hashCode() {
        if (this.memoizedHashCode == 0) {
            OooOO0O oooOO0O = new OooOO0O();
            visit(oooOO0O, this);
            this.memoizedHashCode = oooOO0O.f19346OooO00o;
        }
        return this.memoizedHashCode;
    }

    public final boolean isInitialized() {
        return dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.TRUE) != null;
    }

    public void makeImmutable() {
        dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
        this.unknownFields.f19394OooO0Oo = false;
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        o000OOo o000ooo2 = this.unknownFields;
        o000ooo2.OooO00o();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        o000ooo2.OooO0Oo((i << 3) | 2, byteString);
    }

    public final void mergeUnknownFields(o000OOo o000ooo2) {
        this.unknownFields = o000OOo.OooO0OO(this.unknownFields, o000ooo2);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        o000OOo o000ooo2 = this.unknownFields;
        o000ooo2.OooO00o();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        o000ooo2.OooO0Oo((i << 3) | 0, Long.valueOf(i2));
    }

    public boolean parseUnknownField(int i, com.google.protobuf.OooOO0O oooOO0O) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.OooO0O0(i, oooOO0O);
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        o0ooOOo.OooO0OO(this, sb, 0);
        return sb.toString();
    }

    public void visit(OooOOO oooOOO, MessageType messagetype) {
        dynamicMethod(MethodToInvoke.VISIT, oooOOO, messagetype);
        this.unknownFields = oooOOO.OooO0o0(this.unknownFields, messagetype.unknownFields);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        return t.dynamicMethod(MethodToInvoke.IS_INITIALIZED, Boolean.valueOf(z)) != null;
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // com.google.protobuf.o00oO0o
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.oo000o
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // com.google.protobuf.oo000o
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, oooOo00));
    }

    public boolean equals(OooO0OO oooO0OO, oo000o oo000oVar) {
        if (this == oo000oVar) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(oo000oVar)) {
            return false;
        }
        visit(oooO0OO, (GeneratedMessageLite) oo000oVar);
        return true;
    }

    public static final <T extends GeneratedMessageLite<T, ?>> void makeImmutable(T t) {
        t.dynamicMethod(MethodToInvoke.MAKE_IMMUTABLE);
    }

    public static o000oOoO.OooOO0O mutableCopy(o000oOoO.OooOO0O oooOO0O) {
        int i = ((o00Ooo) oooOO0O).f19400Oooo0oo;
        return ((o00Ooo) oooOO0O).OooOoO(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, oooOo00));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, OooOo00.OooO00o()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, oooOo00));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.OooOO0O oooOO0O, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        T t2 = (T) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            t2.dynamicMethod(MethodToInvoke.MERGE_FROM_STREAM, oooOO0O, oooOo00);
            t2.makeImmutable();
            return t2;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw e;
        }
    }

    public static o000oOoO.OooO mutableCopy(o000oOoO.OooO oooO) {
        int i = ((Oooo000) oooO).f19384Oooo0oo;
        return ((Oooo000) oooO).OooOoO(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.protobuf.OooOO0O.OooO0OO(inputStream), OooOo00.OooO00o()));
    }

    public int hashCode(OooOO0O oooOO0O) {
        if (this.memoizedHashCode == 0) {
            int i = oooOO0O.f19346OooO00o;
            oooOO0O.f19346OooO00o = 0;
            visit(oooOO0O, this);
            this.memoizedHashCode = oooOO0O.f19346OooO00o;
            oooOO0O.f19346OooO00o = i;
        }
        return this.memoizedHashCode;
    }

    public static o000oOoO.OooO0O0 mutableCopy(o000oOoO.OooO0O0 oooO0O0) {
        int i = ((com.google.protobuf.OooOOO0) oooO0O0).f19370Oooo0oo;
        return ((com.google.protobuf.OooOOO0) oooO0O0).OooOoO(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, com.google.protobuf.OooOO0O.OooO0OO(inputStream), oooOo00));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, com.google.protobuf.OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, oooOO0O, OooOo00.OooO00o());
    }

    public static o000oOoO.OooO00o mutableCopy(o000oOoO.OooO00o oooO00o) {
        int i = ((com.google.protobuf.OooO0o) oooO00o).f19354Oooo0oo;
        return ((com.google.protobuf.OooO0o) oooO00o).OooOoO(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.OooOO0O oooOO0O) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, oooOO0O, OooOo00.OooO00o());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        try {
            com.google.protobuf.OooOO0O oooOO0OOooO0o0 = byteString.OooO0o0();
            T t2 = (T) parsePartialFrom(t, oooOO0OOooO0o0, oooOo00);
            try {
                oooOO0OOooO0o0.OooO00o(0);
                return t2;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, com.google.protobuf.OooOO0O oooOO0O, OooOo00 oooOo00) throws InvalidProtocolBufferException {
        return (T) checkMessageInitialized(parsePartialFrom(t, oooOO0O, oooOo00));
    }

    public static <E> o000oOoO.OooOOO0<E> mutableCopy(o000oOoO.OooOOO0<E> oooOOO0) {
        int size = oooOOO0.size();
        return oooOOO0.OooOoO(size == 0 ? 10 : size * 2);
    }
}

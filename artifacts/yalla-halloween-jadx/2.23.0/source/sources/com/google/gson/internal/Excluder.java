package com.google.gson.internal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Excluder implements com.google.gson.o0OOO0o, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List<com.google.gson.OooO00o> serializationStrategies = Collections.emptyList();
    private List<com.google.gson.OooO00o> deserializationStrategies = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO00o<T> extends com.google.gson.o0ooOOo<T> {
        private com.google.gson.o0ooOOo<T> delegate;
        final /* synthetic */ com.google.gson.OooOOO0 val$gson;
        final /* synthetic */ boolean val$skipDeserialize;
        final /* synthetic */ boolean val$skipSerialize;
        final /* synthetic */ TypeToken val$type;

        public OooO00o(boolean z, boolean z2, com.google.gson.OooOOO0 oooOOO0, TypeToken typeToken) {
            this.val$skipDeserialize = z;
            this.val$skipSerialize = z2;
            this.val$gson = oooOOO0;
            this.val$type = typeToken;
        }

        private com.google.gson.o0ooOOo<T> delegate() {
            com.google.gson.o0ooOOo<T> o0ooooo = this.delegate;
            if (o0ooooo != null) {
                return o0ooooo;
            }
            com.google.gson.o0ooOOo<T> o0oooooOooO0o = this.val$gson.OooO0o(Excluder.this, this.val$type);
            this.delegate = o0oooooOooO0o;
            return o0oooooOooO0o;
        }

        @Override // com.google.gson.o0ooOOo
        public T read(JsonReader jsonReader) throws IOException {
            if (!this.val$skipDeserialize) {
                return delegate().read(jsonReader);
            }
            jsonReader.skipValue();
            return null;
        }

        @Override // com.google.gson.o0ooOOo
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (this.val$skipSerialize) {
                jsonWriter.nullValue();
            } else {
                delegate().write(jsonWriter, t);
            }
        }
    }

    private boolean excludeClassChecks(Class<?> cls) {
        if (this.version == IGNORE_VERSIONS || isValidVersion((Since) cls.getAnnotation(Since.class), (Until) cls.getAnnotation(Until.class))) {
            return (!this.serializeInnerClasses && isInnerClass(cls)) || isAnonymousOrNonStaticLocal(cls);
        }
        return true;
    }

    private boolean excludeClassInStrategy(Class<?> cls, boolean z) {
        Iterator<com.google.gson.OooO00o> it = (z ? this.serializationStrategies : this.deserializationStrategies).iterator();
        while (it.hasNext()) {
            if (it.next().OooO00o()) {
                return true;
            }
        }
        return false;
    }

    private boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || isStatic(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean isInnerClass(Class<?> cls) {
        return cls.isMemberClass() && !isStatic(cls);
    }

    private boolean isStatic(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean isValidSince(Since since) {
        return since == null || since.value() <= this.version;
    }

    private boolean isValidUntil(Until until) {
        return until == null || until.value() > this.version;
    }

    private boolean isValidVersion(Since since, Until until) {
        return isValidSince(since) && isValidUntil(until);
    }

    @Override // com.google.gson.o0OOO0o
    public <T> com.google.gson.o0ooOOo<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        boolean zExcludeClassChecks = excludeClassChecks(rawType);
        boolean z = zExcludeClassChecks || excludeClassInStrategy(rawType, true);
        boolean z2 = zExcludeClassChecks || excludeClassInStrategy(rawType, false);
        if (z || z2) {
            return new OooO00o(z2, z, oooOOO0, typeToken);
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderM4182clone = m4182clone();
        excluderM4182clone.serializeInnerClasses = false;
        return excluderM4182clone;
    }

    public boolean excludeClass(Class<?> cls, boolean z) {
        return excludeClassChecks(cls) || excludeClassInStrategy(cls, z);
    }

    public boolean excludeField(Field field, boolean z) {
        Expose expose;
        if ((this.modifiers & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.version != IGNORE_VERSIONS && !isValidVersion((Since) field.getAnnotation(Since.class), (Until) field.getAnnotation(Until.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.requireExpose && ((expose = (Expose) field.getAnnotation(Expose.class)) == null || (!z ? expose.deserialize() : expose.serialize()))) {
            return true;
        }
        if ((!this.serializeInnerClasses && isInnerClass(field.getType())) || isAnonymousOrNonStaticLocal(field.getType())) {
            return true;
        }
        List<com.google.gson.OooO00o> list = z ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        Iterator<com.google.gson.OooO00o> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0O0()) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM4182clone = m4182clone();
        excluderM4182clone.requireExpose = true;
        return excluderM4182clone;
    }

    public Excluder withExclusionStrategy(com.google.gson.OooO00o oooO00o, boolean z, boolean z2) {
        Excluder excluderM4182clone = m4182clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            excluderM4182clone.serializationStrategies = arrayList;
            arrayList.add(oooO00o);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            excluderM4182clone.deserializationStrategies = arrayList2;
            arrayList2.add(oooO00o);
        }
        return excluderM4182clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM4182clone = m4182clone();
        excluderM4182clone.modifiers = 0;
        for (int i : iArr) {
            excluderM4182clone.modifiers = i | excluderM4182clone.modifiers;
        }
        return excluderM4182clone;
    }

    public Excluder withVersion(double d) {
        Excluder excluderM4182clone = m4182clone();
        excluderM4182clone.version = d;
        return excluderM4182clone;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m4182clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

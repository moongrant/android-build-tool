package com.google.gson.internal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Since;
import com.google.gson.annotations.Until;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p386o0OOoo0O.o000O00O;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Excluder implements o00O0O00, Cloneable {
    public static final Excluder DEFAULT = new Excluder();
    private static final double IGNORE_VERSIONS = -1.0d;
    private boolean requireExpose;
    private double version = IGNORE_VERSIONS;
    private int modifiers = 136;
    private boolean serializeInnerClasses = true;
    private List<o000O00O> serializationStrategies = Collections.emptyList();
    private List<o000O00O> deserializationStrategies = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO00o<T> extends o00O0<T> {
        private o00O0<T> delegate;
        public final /* synthetic */ o000OOo0 val$gson;
        public final /* synthetic */ boolean val$skipDeserialize;
        public final /* synthetic */ boolean val$skipSerialize;
        public final /* synthetic */ o00000O0 val$type;

        public OooO00o(boolean z, boolean z2, o000OOo0 o000ooo1, o00000O0 o00000o1) {
            this.val$skipDeserialize = z;
            this.val$skipSerialize = z2;
            this.val$gson = o000ooo1;
            this.val$type = o00000o1;
        }

        private o00O0<T> delegate() {
            o00O0<T> o00o1 = this.delegate;
            if (o00o1 != null) {
                return o00o1;
            }
            o00O0<T> o00o0OooO0o = this.val$gson.OooO0o(Excluder.this, this.val$type);
            this.delegate = o00o0OooO0o;
            return o00o0OooO0o;
        }

        @Override // p386o0OOoo0O.o00O0
        public T read(JsonReader jsonReader) throws IOException {
            if (!this.val$skipDeserialize) {
                return delegate().read(jsonReader);
            }
            jsonReader.skipValue();
            return null;
        }

        @Override // p386o0OOoo0O.o00O0
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
        Iterator<o000O00O> it = (z ? this.serializationStrategies : this.deserializationStrategies).iterator();
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

    @Override // p386o0OOoo0O.o00O0O00
    public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
        Class<? super T> rawType = o00000o1.getRawType();
        boolean zExcludeClassChecks = excludeClassChecks(rawType);
        boolean z = zExcludeClassChecks || excludeClassInStrategy(rawType, true);
        boolean z2 = zExcludeClassChecks || excludeClassInStrategy(rawType, false);
        if (z || z2) {
            return new OooO00o(z2, z, o000ooo1, o00000o1);
        }
        return null;
    }

    public Excluder disableInnerClassSerialization() {
        Excluder excluderM237clone = m237clone();
        excluderM237clone.serializeInnerClasses = false;
        return excluderM237clone;
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
        List<o000O00O> list = z ? this.serializationStrategies : this.deserializationStrategies;
        if (list.isEmpty()) {
            return false;
        }
        Objects.requireNonNull(field);
        Iterator<o000O00O> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().OooO0O0()) {
                return true;
            }
        }
        return false;
    }

    public Excluder excludeFieldsWithoutExposeAnnotation() {
        Excluder excluderM237clone = m237clone();
        excluderM237clone.requireExpose = true;
        return excluderM237clone;
    }

    public Excluder withExclusionStrategy(o000O00O o000o00o2, boolean z, boolean z2) {
        Excluder excluderM237clone = m237clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.serializationStrategies);
            excluderM237clone.serializationStrategies = arrayList;
            arrayList.add(o000o00o2);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.deserializationStrategies);
            excluderM237clone.deserializationStrategies = arrayList2;
            arrayList2.add(o000o00o2);
        }
        return excluderM237clone;
    }

    public Excluder withModifiers(int... iArr) {
        Excluder excluderM237clone = m237clone();
        excluderM237clone.modifiers = 0;
        for (int i : iArr) {
            excluderM237clone.modifiers = i | excluderM237clone.modifiers;
        }
        return excluderM237clone;
    }

    public Excluder withVersion(double d) {
        Excluder excluderM237clone = m237clone();
        excluderM237clone.version = d;
        return excluderM237clone;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Excluder m237clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}

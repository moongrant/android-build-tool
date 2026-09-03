package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.util.concurrent.atomic.AtomicReference;
import p222o00oOOOO.o00OOO0;
import p222o00oOOOO.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public class JsonFactory extends TokenStreamFactory {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f13781OooO0Oo = 0;

    public enum Feature {
        INTERN_FIELD_NAMES,
        CANONICALIZE_FIELD_NAMES,
        FAIL_ON_SYMBOL_HASH_OVERFLOW,
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING;

        private final boolean _defaultState = true;

        Feature() {
        }

        public static int OooO00o() {
            int iOrdinal = 0;
            for (Feature feature : values()) {
                if (feature._defaultState) {
                    iOrdinal |= 1 << feature.ordinal();
                }
            }
            return iOrdinal;
        }
    }

    static {
        Feature.OooO00o();
        JsonParser$Feature.OooO00o();
        JsonGenerator$Feature.OooO00o();
        SerializedString serializedString = DefaultPrettyPrinter.f13792OooO0Oo;
    }

    public JsonFactory() {
        System.currentTimeMillis();
        new AtomicReference(new o00OOO0());
        System.currentTimeMillis();
        new AtomicReference(new o00OOO00());
    }

    public Object readResolve() {
        return new JsonFactory(this, null);
    }

    public JsonFactory(JsonFactory jsonFactory, OooO0O0 oooO0O0) {
        System.currentTimeMillis();
        new AtomicReference(new o00OOO0());
        System.currentTimeMillis();
        new AtomicReference(new o00OOO00());
        jsonFactory.getClass();
    }
}

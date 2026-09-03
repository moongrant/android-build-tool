package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f13042OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f13043OooO00o = new HashMap();

    public class OooO00o implements OooO.OooO00o<Object> {
        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final Class<Object> OooO00o() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.OooO.OooO00o
        @NonNull
        public final OooO<Object> build(@NonNull Object obj) {
            return new OooO0O0(obj);
        }
    }

    public static final class OooO0O0 implements OooO<Object> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f13044OooO00o;

        public OooO0O0(@NonNull Object obj) {
            this.f13044OooO00o = obj;
        }

        @Override // com.bumptech.glide.load.data.OooO
        @NonNull
        public final Object OooO00o() {
            return this.f13044OooO00o;
        }

        @Override // com.bumptech.glide.load.data.OooO
        public final void OooO0O0() {
        }
    }
}

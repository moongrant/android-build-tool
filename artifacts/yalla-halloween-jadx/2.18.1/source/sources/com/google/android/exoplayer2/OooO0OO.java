package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO implements Player {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000oOoO.OooO0OO f13198OooO00o = new o000oOoO.OooO0OO();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Player.OooO00o f13199OooO00o;

        public OooO00o(Player.OooO00o oooO00o) {
            this.f13199OooO00o = oooO00o;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO00o.class != obj.getClass()) {
                return false;
            }
            return this.f13199OooO00o.equals(((OooO00o) obj).f13199OooO00o);
        }

        public final int hashCode() {
            return this.f13199OooO00o.hashCode();
        }
    }

    public interface OooO0O0 {
        void OooO0OO(Player.OooO00o oooO00o);
    }
}

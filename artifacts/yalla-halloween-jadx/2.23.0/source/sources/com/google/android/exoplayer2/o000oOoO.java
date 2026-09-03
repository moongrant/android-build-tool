package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0OoO00O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ULong;
import p039OoooOoo.o00O0O00;
import p172o00OooOo.o000O;
import p172o00OooOo.o000O0O0;
import p172o00OooOo.o000OO0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;
import p245o00oo0o.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000oOoO implements com.google.android.exoplayer2.OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOOO0 f12667OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f12668OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f12669OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooOO0O f12670OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final MediaMetadata f12671OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0o f12672OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final o000oOoO f12659OooOO0 = new OooO0O0().OooO00o();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f12660OooOO0O = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f12661OooOO0o = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f12663OooOOO0 = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f12662OooOOO = o0O00.Oooo00O(3);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f12664OooOOOO = o0O00.Oooo00O(4);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f12665OooOOOo = o0O00.Oooo00O(5);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final o00O0O00 f12666OooOOo0 = new o00O0O00();

    public static final class OooO00o implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f12700OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final String f12699OooO0o0 = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final androidx.compose.animation.core.OooO0OO f12698OooO0o = new androidx.compose.animation.core.OooO0OO();

        /* JADX INFO: renamed from: com.google.android.exoplayer2.o000oOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0208OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Uri f12701OooO00o;

            public C0208OooO00o(Uri uri) {
                this.f12701OooO00o = uri;
            }
        }

        public OooO00o(C0208OooO00o c0208OooO00o) {
            this.f12700OooO0Oo = c0208OooO00o.f12701OooO00o;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                return this.f12700OooO0Oo.equals(((OooO00o) obj).f12700OooO0Oo) && o0O00.OooO00o(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f12700OooO0Oo.hashCode() * 31) + 0;
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f12699OooO0o0, this.f12700OooO0Oo);
            return bundle;
        }
    }

    public static class OooO0OO implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @IntRange(from = ULong.MIN_VALUE)
        public final long f12722OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f12723OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f12724OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f12725OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f12726OooO0oo;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO0o f12715OooO = new OooO0o(new OooO00o());

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f12716OooOO0 = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f12717OooOO0O = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f12718OooOO0o = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f12720OooOOO0 = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f12719OooOOO = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final o000OO0O f12721OooOOOO = new o000OO0O();

        public OooO0OO(OooO00o oooO00o) {
            this.f12722OooO0Oo = oooO00o.f12727OooO00o;
            this.f12724OooO0o0 = oooO00o.f12728OooO0O0;
            this.f12723OooO0o = oooO00o.f12729OooO0OO;
            this.f12725OooO0oO = oooO00o.f12730OooO0Oo;
            this.f12726OooO0oo = oooO00o.f12731OooO0o0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f12722OooO0Oo == oooO0OO.f12722OooO0Oo && this.f12724OooO0o0 == oooO0OO.f12724OooO0o0 && this.f12723OooO0o == oooO0OO.f12723OooO0o && this.f12725OooO0oO == oooO0OO.f12725OooO0oO && this.f12726OooO0oo == oooO0OO.f12726OooO0oo;
        }

        public final int hashCode() {
            long j = this.f12722OooO0Oo;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f12724OooO0o0;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f12723OooO0o ? 1 : 0)) * 31) + (this.f12725OooO0oO ? 1 : 0)) * 31) + (this.f12726OooO0oo ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            OooO0o oooO0o = f12715OooO;
            long j = oooO0o.f12722OooO0Oo;
            long j2 = this.f12722OooO0Oo;
            if (j2 != j) {
                bundle.putLong(f12716OooOO0, j2);
            }
            long j3 = this.f12724OooO0o0;
            if (j3 != oooO0o.f12724OooO0o0) {
                bundle.putLong(f12717OooOO0O, j3);
            }
            boolean z = oooO0o.f12723OooO0o;
            boolean z2 = this.f12723OooO0o;
            if (z2 != z) {
                bundle.putBoolean(f12718OooOO0o, z2);
            }
            boolean z3 = oooO0o.f12725OooO0oO;
            boolean z4 = this.f12725OooO0oO;
            if (z4 != z3) {
                bundle.putBoolean(f12720OooOOO0, z4);
            }
            boolean z5 = oooO0o.f12726OooO0oo;
            boolean z6 = this.f12726OooO0oo;
            if (z6 != z5) {
                bundle.putBoolean(f12719OooOOO, z6);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public long f12727OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public long f12728OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public boolean f12729OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public boolean f12730OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public boolean f12731OooO0o0;

            public OooO00o() {
                this.f12728OooO0O0 = Long.MIN_VALUE;
            }

            public OooO00o(OooO0o oooO0o) {
                this.f12727OooO00o = oooO0o.f12722OooO0Oo;
                this.f12728OooO0O0 = oooO0o.f12724OooO0o0;
                this.f12729OooO0OO = oooO0o.f12723OooO0o;
                this.f12730OooO0Oo = oooO0o.f12725OooO0oO;
                this.f12731OooO0o0 = oooO0o.f12726OooO0oo;
            }
        }
    }

    @Deprecated
    public static final class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final OooO0o f12732OooOOOo = new OooO0o(new OooO0OO.OooO00o());
    }

    public static final class OooOO0O implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final String f12758OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f12759OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final OooO f12760OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final String f12761OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final OooO00o f12762OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final List<StreamKey> f12763OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final ImmutableList<OooOOOO> f12764OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final Object f12765OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f12750OooOO0o = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f12752OooOOO0 = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f12751OooOOO = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f12753OooOOOO = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f12754OooOOOo = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f12756OooOOo0 = o0O00.Oooo00O(5);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f12755OooOOo = o0O00.Oooo00O(6);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final androidx.compose.compiler.plugins.kotlin.OooO00o f12757OooOOoo = new androidx.compose.compiler.plugins.kotlin.OooO00o();

        public OooOO0O(Uri uri, @Nullable String str, @Nullable OooO oooO, @Nullable OooO00o oooO00o, List<StreamKey> list, @Nullable String str2, ImmutableList<OooOOOO> immutableList, @Nullable Object obj) {
            this.f12759OooO0Oo = uri;
            this.f12761OooO0o0 = str;
            this.f12760OooO0o = oooO;
            this.f12762OooO0oO = oooO00o;
            this.f12763OooO0oo = list;
            this.f12758OooO = str2;
            this.f12764OooOO0 = immutableList;
            ImmutableList.OooO00o oooO00oOooOO0 = ImmutableList.OooOO0();
            for (int i = 0; i < immutableList.size(); i++) {
                oooO00oOooOO0.OooO0o0(OooOOOO.OooO00o.OooO00o(immutableList.get(i).OooO00o()));
            }
            oooO00oOooOO0.OooO0oo();
            this.f12765OooOO0O = obj;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0O)) {
                return false;
            }
            OooOO0O oooOO0O = (OooOO0O) obj;
            return this.f12759OooO0Oo.equals(oooOO0O.f12759OooO0Oo) && o0O00.OooO00o(this.f12761OooO0o0, oooOO0O.f12761OooO0o0) && o0O00.OooO00o(this.f12760OooO0o, oooOO0O.f12760OooO0o) && o0O00.OooO00o(this.f12762OooO0oO, oooOO0O.f12762OooO0oO) && this.f12763OooO0oo.equals(oooOO0O.f12763OooO0oo) && o0O00.OooO00o(this.f12758OooO, oooOO0O.f12758OooO) && this.f12764OooOO0.equals(oooOO0O.f12764OooOO0) && o0O00.OooO00o(this.f12765OooOO0O, oooOO0O.f12765OooOO0O);
        }

        public final int hashCode() {
            int iHashCode = this.f12759OooO0Oo.hashCode() * 31;
            String str = this.f12761OooO0o0;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            OooO oooO = this.f12760OooO0o;
            int iHashCode3 = (iHashCode2 + (oooO == null ? 0 : oooO.hashCode())) * 31;
            OooO00o oooO00o = this.f12762OooO0oO;
            int iHashCode4 = (this.f12763OooO0oo.hashCode() + ((iHashCode3 + (oooO00o == null ? 0 : oooO00o.hashCode())) * 31)) * 31;
            String str2 = this.f12758OooO;
            int iHashCode5 = (this.f12764OooOO0.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f12765OooOO0O;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f12750OooOO0o, this.f12759OooO0Oo);
            String str = this.f12761OooO0o0;
            if (str != null) {
                bundle.putString(f12752OooOOO0, str);
            }
            OooO oooO = this.f12760OooO0o;
            if (oooO != null) {
                bundle.putBundle(f12751OooOOO, oooO.toBundle());
            }
            OooO00o oooO00o = this.f12762OooO0oO;
            if (oooO00o != null) {
                bundle.putBundle(f12753OooOOOO, oooO00o.toBundle());
            }
            List<StreamKey> list = this.f12763OooO0oo;
            if (!list.isEmpty()) {
                bundle.putParcelableArrayList(f12754OooOOOo, oOO00O.OooO0O0(list));
            }
            String str2 = this.f12758OooO;
            if (str2 != null) {
                bundle.putString(f12756OooOOo0, str2);
            }
            ImmutableList<OooOOOO> immutableList = this.f12764OooOO0;
            if (!immutableList.isEmpty()) {
                bundle.putParcelableArrayList(f12755OooOOo, oOO00O.OooO0O0(immutableList));
            }
            return bundle;
        }
    }

    @Deprecated
    public static final class OooOOO extends OooOOOO {
    }

    public static final class OooOOO0 implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Uri f12771OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final Bundle f12772OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final String f12773OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooOOO0 f12767OooO0oO = new OooOOO0(new OooO00o());

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final String f12768OooO0oo = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f12766OooO = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f12769OooOO0 = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final androidx.compose.compiler.plugins.kotlin.OooO0OO f12770OooOO0O = new androidx.compose.compiler.plugins.kotlin.OooO0OO();

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public Uri f12774OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public String f12775OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @Nullable
            public Bundle f12776OooO0OO;
        }

        public OooOOO0(OooO00o oooO00o) {
            this.f12771OooO0Oo = oooO00o.f12774OooO00o;
            this.f12773OooO0o0 = oooO00o.f12775OooO0O0;
            this.f12772OooO0o = oooO00o.f12776OooO0OO;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO0)) {
                return false;
            }
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            return o0O00.OooO00o(this.f12771OooO0Oo, oooOOO0.f12771OooO0Oo) && o0O00.OooO00o(this.f12773OooO0o0, oooOOO0.f12773OooO0o0);
        }

        public final int hashCode() {
            Uri uri = this.f12771OooO0Oo;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f12773OooO0o0;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f12771OooO0Oo;
            if (uri != null) {
                bundle.putParcelable(f12768OooO0oo, uri);
            }
            String str = this.f12773OooO0o0;
            if (str != null) {
                bundle.putString(f12766OooO, str);
            }
            Bundle bundle2 = this.f12772OooO0o;
            if (bundle2 != null) {
                bundle.putBundle(f12769OooOO0, bundle2);
            }
            return bundle;
        }
    }

    public static class OooOOOO implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final String f12785OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f12786OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final String f12787OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final String f12788OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f12789OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f12790OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final String f12791OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f12777OooOO0O = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f12778OooOO0o = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f12780OooOOO0 = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f12779OooOOO = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f12781OooOOOO = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f12782OooOOOo = o0O00.Oooo00O(5);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f12784OooOOo0 = o0O00.Oooo00O(6);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final androidx.compose.compiler.plugins.kotlin.OooO0o f12783OooOOo = new androidx.compose.compiler.plugins.kotlin.OooO0o();

        public OooOOOO(OooO00o oooO00o) {
            this.f12786OooO0Oo = oooO00o.f12792OooO00o;
            this.f12788OooO0o0 = oooO00o.f12793OooO0O0;
            this.f12787OooO0o = oooO00o.f12794OooO0OO;
            this.f12789OooO0oO = oooO00o.f12795OooO0Oo;
            this.f12790OooO0oo = oooO00o.f12797OooO0o0;
            this.f12785OooO = oooO00o.f12796OooO0o;
            this.f12791OooOO0 = oooO00o.f12798OooO0oO;
        }

        public final OooO00o OooO00o() {
            return new OooO00o(this);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOOO)) {
                return false;
            }
            OooOOOO oooOOOO = (OooOOOO) obj;
            return this.f12786OooO0Oo.equals(oooOOOO.f12786OooO0Oo) && o0O00.OooO00o(this.f12788OooO0o0, oooOOOO.f12788OooO0o0) && o0O00.OooO00o(this.f12787OooO0o, oooOOOO.f12787OooO0o) && this.f12789OooO0oO == oooOOOO.f12789OooO0oO && this.f12790OooO0oo == oooOOOO.f12790OooO0oo && o0O00.OooO00o(this.f12785OooO, oooOOOO.f12785OooO) && o0O00.OooO00o(this.f12791OooOO0, oooOOOO.f12791OooOO0);
        }

        public final int hashCode() {
            int iHashCode = this.f12786OooO0Oo.hashCode() * 31;
            String str = this.f12788OooO0o0;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f12787OooO0o;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f12789OooO0oO) * 31) + this.f12790OooO0oo) * 31;
            String str3 = this.f12785OooO;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f12791OooOO0;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f12777OooOO0O, this.f12786OooO0Oo);
            String str = this.f12788OooO0o0;
            if (str != null) {
                bundle.putString(f12778OooOO0o, str);
            }
            String str2 = this.f12787OooO0o;
            if (str2 != null) {
                bundle.putString(f12780OooOOO0, str2);
            }
            int i = this.f12789OooO0oO;
            if (i != 0) {
                bundle.putInt(f12779OooOOO, i);
            }
            int i2 = this.f12790OooO0oo;
            if (i2 != 0) {
                bundle.putInt(f12781OooOOOO, i2);
            }
            String str3 = this.f12785OooO;
            if (str3 != null) {
                bundle.putString(f12782OooOOOo, str3);
            }
            String str4 = this.f12791OooOO0;
            if (str4 != null) {
                bundle.putString(f12784OooOOo0, str4);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Uri f12792OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public String f12793OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @Nullable
            public String f12794OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f12795OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            @Nullable
            public String f12796OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f12797OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            @Nullable
            public String f12798OooO0oO;

            public OooO00o(Uri uri) {
                this.f12792OooO00o = uri;
            }

            public static OooOOO OooO00o(OooO00o oooO00o) {
                return new OooOOO(oooO00o);
            }

            public OooO00o(OooOOOO oooOOOO) {
                this.f12792OooO00o = oooOOOO.f12786OooO0Oo;
                this.f12793OooO0O0 = oooOOOO.f12788OooO0o0;
                this.f12794OooO0OO = oooOOOO.f12787OooO0o;
                this.f12795OooO0Oo = oooOOOO.f12789OooO0oO;
                this.f12797OooO0o0 = oooOOOO.f12790OooO0oo;
                this.f12796OooO0o = oooOOOO.f12785OooO;
                this.f12798OooO0oO = oooOOOO.f12791OooOO0;
            }
        }
    }

    public o000oOoO(String str, OooO0o oooO0o, @Nullable OooOO0O oooOO0O, OooOO0 oooOO1, MediaMetadata mediaMetadata, OooOOO0 oooOOO0) {
        this.f12668OooO0Oo = str;
        this.f12670OooO0o0 = oooOO0O;
        this.f12669OooO0o = oooOO1;
        this.f12671OooO0oO = mediaMetadata;
        this.f12672OooO0oo = oooO0o;
        this.f12667OooO = oooOOO0;
    }

    public static o000oOoO OooO00o(String str) {
        OooO0O0 oooO0O0 = new OooO0O0();
        oooO0O0.f12704OooO0O0 = str == null ? null : Uri.parse(str);
        return oooO0O0.OooO00o();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        return o0O00.OooO00o(this.f12668OooO0Oo, o000oooo2.f12668OooO0Oo) && this.f12672OooO0oo.equals(o000oooo2.f12672OooO0oo) && o0O00.OooO00o(this.f12670OooO0o0, o000oooo2.f12670OooO0o0) && o0O00.OooO00o(this.f12669OooO0o, o000oooo2.f12669OooO0o) && o0O00.OooO00o(this.f12671OooO0oO, o000oooo2.f12671OooO0oO) && o0O00.OooO00o(this.f12667OooO, o000oooo2.f12667OooO);
    }

    public final int hashCode() {
        int iHashCode = this.f12668OooO0Oo.hashCode() * 31;
        OooOO0O oooOO0O = this.f12670OooO0o0;
        return this.f12667OooO.hashCode() + ((this.f12671OooO0oO.hashCode() + ((this.f12672OooO0oo.hashCode() + ((this.f12669OooO0o.hashCode() + ((iHashCode + (oooOO0O != null ? oooOO0O.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.f12668OooO0Oo;
        if (!str.equals("")) {
            bundle.putString(f12660OooOO0O, str);
        }
        OooOO0 oooOO1 = OooOO0.f12733OooO;
        OooOO0 oooOO2 = this.f12669OooO0o;
        if (!oooOO2.equals(oooOO1)) {
            bundle.putBundle(f12661OooOO0o, oooOO2.toBundle());
        }
        MediaMetadata mediaMetadata = MediaMetadata.f10930Oooo0o0;
        MediaMetadata mediaMetadata2 = this.f12671OooO0oO;
        if (!mediaMetadata2.equals(mediaMetadata)) {
            bundle.putBundle(f12663OooOOO0, mediaMetadata2.toBundle());
        }
        OooO0o oooO0o = OooO0OO.f12715OooO;
        OooO0o oooO0o2 = this.f12672OooO0oo;
        if (!oooO0o2.equals(oooO0o)) {
            bundle.putBundle(f12662OooOOO, oooO0o2.toBundle());
        }
        OooOOO0 oooOOO0 = OooOOO0.f12767OooO0oO;
        OooOOO0 oooOOO1 = this.f12667OooO;
        if (!oooOOO1.equals(oooOOO0)) {
            bundle.putBundle(f12664OooOOOO, oooOOO1.toBundle());
        }
        return bundle;
    }

    public static final class OooOO0 implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f12740OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f12741OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f12742OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f12743OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f12744OooO0oo;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooOO0 f12733OooO = new OooOO0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f12734OooOO0 = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f12735OooOO0O = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f12736OooOO0o = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f12738OooOOO0 = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f12737OooOOO = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final o000O f12739OooOOOO = new o000O();

        @Deprecated
        public OooOO0(long j, long j2, long j3, float f, float f2) {
            this.f12740OooO0Oo = j;
            this.f12742OooO0o0 = j2;
            this.f12741OooO0o = j3;
            this.f12743OooO0oO = f;
            this.f12744OooO0oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0)) {
                return false;
            }
            OooOO0 oooOO1 = (OooOO0) obj;
            return this.f12740OooO0Oo == oooOO1.f12740OooO0Oo && this.f12742OooO0o0 == oooOO1.f12742OooO0o0 && this.f12741OooO0o == oooOO1.f12741OooO0o && this.f12743OooO0oO == oooOO1.f12743OooO0oO && this.f12744OooO0oo == oooOO1.f12744OooO0oo;
        }

        public final int hashCode() {
            long j = this.f12740OooO0Oo;
            long j2 = this.f12742OooO0o0;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f12741OooO0o;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f12743OooO0oO;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f12744OooO0oo;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f12740OooO0Oo;
            if (j != -9223372036854775807L) {
                bundle.putLong(f12734OooOO0, j);
            }
            long j2 = this.f12742OooO0o0;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f12735OooOO0O, j2);
            }
            long j3 = this.f12741OooO0o;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f12736OooOO0o, j3);
            }
            float f = this.f12743OooO0oO;
            if (f != -3.4028235E38f) {
                bundle.putFloat(f12738OooOOO0, f);
            }
            float f2 = this.f12744OooO0oo;
            if (f2 != -3.4028235E38f) {
                bundle.putFloat(f12737OooOOO, f2);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public long f12745OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public long f12746OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public long f12747OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public float f12748OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float f12749OooO0o0;

            public OooO00o() {
                this.f12745OooO00o = -9223372036854775807L;
                this.f12746OooO0O0 = -9223372036854775807L;
                this.f12747OooO0OO = -9223372036854775807L;
                this.f12748OooO0Oo = -3.4028235E38f;
                this.f12749OooO0o0 = -3.4028235E38f;
            }

            public OooO00o(OooOO0 oooOO1) {
                this.f12745OooO00o = oooOO1.f12740OooO0Oo;
                this.f12746OooO0O0 = oooOO1.f12742OooO0o0;
                this.f12747OooO0OO = oooOO1.f12741OooO0o;
                this.f12748OooO0Oo = oooOO1.f12743OooO0oO;
                this.f12749OooO0o0 = oooOO1.f12744OooO0oo;
            }
        }
    }

    public static final class OooO implements com.google.android.exoplayer2.OooO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f12682OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final UUID f12683OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ImmutableMap<String, String> f12684OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Uri f12685OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f12686OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f12687OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final ImmutableList<Integer> f12688OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final byte[] f12689OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f12673OooOO0o = o0O00.Oooo00O(0);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f12675OooOOO0 = o0O00.Oooo00O(1);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f12674OooOOO = o0O00.Oooo00O(2);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f12676OooOOOO = o0O00.Oooo00O(3);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f12677OooOOOo = o0O00.Oooo00O(4);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f12679OooOOo0 = o0O00.Oooo00O(5);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f12678OooOOo = o0O00.Oooo00O(6);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final String f12680OooOOoo = o0O00.Oooo00O(7);

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public static final o000O0O0 f12681OooOo00 = new o000O0O0();

        public OooO(OooO00o oooO00o) {
            o00O000o.OooO0Oo((oooO00o.f12694OooO0o && oooO00o.f12691OooO0O0 == null) ? false : true);
            UUID uuid = oooO00o.f12690OooO00o;
            uuid.getClass();
            this.f12683OooO0Oo = uuid;
            this.f12685OooO0o0 = oooO00o.f12691OooO0O0;
            this.f12684OooO0o = oooO00o.f12692OooO0OO;
            this.f12686OooO0oO = oooO00o.f12693OooO0Oo;
            this.f12682OooO = oooO00o.f12694OooO0o;
            this.f12687OooO0oo = oooO00o.f12695OooO0o0;
            this.f12688OooOO0 = oooO00o.f12696OooO0oO;
            byte[] bArr = oooO00o.f12697OooO0oo;
            this.f12689OooOO0O = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return this.f12683OooO0Oo.equals(oooO.f12683OooO0Oo) && o0O00.OooO00o(this.f12685OooO0o0, oooO.f12685OooO0o0) && o0O00.OooO00o(this.f12684OooO0o, oooO.f12684OooO0o) && this.f12686OooO0oO == oooO.f12686OooO0oO && this.f12682OooO == oooO.f12682OooO && this.f12687OooO0oo == oooO.f12687OooO0oo && this.f12688OooOO0.equals(oooO.f12688OooOO0) && Arrays.equals(this.f12689OooOO0O, oooO.f12689OooOO0O);
        }

        public final int hashCode() {
            int iHashCode = this.f12683OooO0Oo.hashCode() * 31;
            Uri uri = this.f12685OooO0o0;
            return Arrays.hashCode(this.f12689OooOO0O) + ((this.f12688OooOO0.hashCode() + ((((((((this.f12684OooO0o.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f12686OooO0oO ? 1 : 0)) * 31) + (this.f12682OooO ? 1 : 0)) * 31) + (this.f12687OooO0oo ? 1 : 0)) * 31)) * 31);
        }

        @Override // com.google.android.exoplayer2.OooO
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f12673OooOO0o, this.f12683OooO0Oo.toString());
            Uri uri = this.f12685OooO0o0;
            if (uri != null) {
                bundle.putParcelable(f12675OooOOO0, uri);
            }
            ImmutableMap<String, String> immutableMap = this.f12684OooO0o;
            if (!immutableMap.isEmpty()) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry<String, String> entry : immutableMap.entrySet()) {
                    bundle2.putString(entry.getKey(), entry.getValue());
                }
                bundle.putBundle(f12674OooOOO, bundle2);
            }
            boolean z = this.f12686OooO0oO;
            if (z) {
                bundle.putBoolean(f12676OooOOOO, z);
            }
            boolean z2 = this.f12687OooO0oo;
            if (z2) {
                bundle.putBoolean(f12677OooOOOo, z2);
            }
            boolean z3 = this.f12682OooO;
            if (z3) {
                bundle.putBoolean(f12679OooOOo0, z3);
            }
            ImmutableList<Integer> immutableList = this.f12688OooOO0;
            if (!immutableList.isEmpty()) {
                bundle.putIntegerArrayList(f12678OooOOo, new ArrayList<>(immutableList));
            }
            byte[] bArr = this.f12689OooOO0O;
            if (bArr != null) {
                bundle.putByteArray(f12680OooOOoo, bArr);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final UUID f12690OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public Uri f12691OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public ImmutableMap<String, String> f12692OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public boolean f12693OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public boolean f12694OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public boolean f12695OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public ImmutableList<Integer> f12696OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            @Nullable
            public byte[] f12697OooO0oo;

            public OooO00o(UUID uuid) {
                this.f12690OooO00o = uuid;
                this.f12692OooO0OO = o0OoO00O.f19626OooOO0;
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
                this.f12696OooO0oO = com.google.common.collect.o0O00.f19536OooO0oo;
            }

            public OooO00o() {
                this.f12692OooO0OO = o0OoO00O.f19626OooOO0;
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
                this.f12696OooO0oO = com.google.common.collect.o0O00.f19536OooO0oo;
            }

            public OooO00o(OooO oooO) {
                this.f12690OooO00o = oooO.f12683OooO0Oo;
                this.f12691OooO0O0 = oooO.f12685OooO0o0;
                this.f12692OooO0OO = oooO.f12684OooO0o;
                this.f12693OooO0Oo = oooO.f12686OooO0oO;
                this.f12695OooO0o0 = oooO.f12687OooO0oo;
                this.f12694OooO0o = oooO.f12682OooO;
                this.f12696OooO0oO = oooO.f12688OooOO0;
                this.f12697OooO0oo = oooO.f12689OooOO0O;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final OooO00o f12702OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f12703OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Uri f12704OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final String f12705OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO.OooO00o f12706OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final List<StreamKey> f12707OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO.OooO00o f12708OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public String f12709OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ImmutableList<OooOOOO> f12710OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Object f12711OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final MediaMetadata f12712OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public OooOO0.OooO00o f12713OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final OooOOO0 f12714OooOOO0;

        public OooO0O0() {
            this.f12706OooO0Oo = new OooO0OO.OooO00o();
            this.f12708OooO0o0 = new OooO.OooO00o();
            this.f12707OooO0o = Collections.emptyList();
            this.f12710OooO0oo = com.google.common.collect.o0O00.f19536OooO0oo;
            this.f12713OooOO0o = new OooOO0.OooO00o();
            this.f12714OooOOO0 = OooOOO0.f12767OooO0oO;
        }

        public final o000oOoO OooO00o() {
            OooOO0O oooOO0O;
            OooO.OooO00o oooO00o = this.f12708OooO0o0;
            o00O000o.OooO0Oo(oooO00o.f12691OooO0O0 == null || oooO00o.f12690OooO00o != null);
            Uri uri = this.f12704OooO0O0;
            if (uri != null) {
                String str = this.f12705OooO0OO;
                OooO.OooO00o oooO00o2 = this.f12708OooO0o0;
                oooOO0O = new OooOO0O(uri, str, oooO00o2.f12690OooO00o != null ? new OooO(oooO00o2) : null, this.f12702OooO, this.f12707OooO0o, this.f12709OooO0oO, this.f12710OooO0oo, this.f12711OooOO0);
            } else {
                oooOO0O = null;
            }
            String str2 = this.f12703OooO00o;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            OooO0OO.OooO00o oooO00o3 = this.f12706OooO0Oo;
            oooO00o3.getClass();
            OooO0o oooO0o = new OooO0o(oooO00o3);
            OooOO0.OooO00o oooO00o4 = this.f12713OooOO0o;
            oooO00o4.getClass();
            OooOO0 oooOO1 = new OooOO0(oooO00o4.f12745OooO00o, oooO00o4.f12746OooO0O0, oooO00o4.f12747OooO0OO, oooO00o4.f12748OooO0Oo, oooO00o4.f12749OooO0o0);
            MediaMetadata mediaMetadata = this.f12712OooOO0O;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.f10930Oooo0o0;
            }
            return new o000oOoO(str3, oooO0o, oooOO0O, oooOO1, mediaMetadata, this.f12714OooOOO0);
        }

        public OooO0O0(o000oOoO o000oooo2) {
            OooO.OooO00o oooO00o;
            this();
            OooO0o oooO0o = o000oooo2.f12672OooO0oo;
            oooO0o.getClass();
            this.f12706OooO0Oo = new OooO0OO.OooO00o(oooO0o);
            this.f12703OooO00o = o000oooo2.f12668OooO0Oo;
            this.f12712OooOO0O = o000oooo2.f12671OooO0oO;
            OooOO0 oooOO1 = o000oooo2.f12669OooO0o;
            oooOO1.getClass();
            this.f12713OooOO0o = new OooOO0.OooO00o(oooOO1);
            this.f12714OooOOO0 = o000oooo2.f12667OooO;
            OooOO0O oooOO0O = o000oooo2.f12670OooO0o0;
            if (oooOO0O != null) {
                this.f12709OooO0oO = oooOO0O.f12758OooO;
                this.f12705OooO0OO = oooOO0O.f12761OooO0o0;
                this.f12704OooO0O0 = oooOO0O.f12759OooO0Oo;
                this.f12707OooO0o = oooOO0O.f12763OooO0oo;
                this.f12710OooO0oo = oooOO0O.f12764OooOO0;
                this.f12711OooOO0 = oooOO0O.f12765OooOO0O;
                OooO oooO = oooOO0O.f12760OooO0o;
                if (oooO != null) {
                    oooO00o = new OooO.OooO00o(oooO);
                } else {
                    oooO00o = new OooO.OooO00o();
                }
                this.f12708OooO0o0 = oooO00o;
                this.f12702OooO = oooOO0O.f12762OooO0oO;
            }
        }
    }
}

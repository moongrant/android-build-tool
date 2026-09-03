package com.google.android.exoplayer2;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f13259OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final OooO f13260OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000OO f13261OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f13262OooO0Oo;

    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Uri f13263OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f13264OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final OooO0o f13265OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final List<StreamKey> f13266OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final List<Object> f13267OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final String f13268OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final Uri f13269OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final Object f13270OooO0oo;

        public OooO(Uri uri, String str, OooO0o oooO0o, List list, String str2, List list2, Uri uri2, Object obj, OooO00o oooO00o) {
            this.f13263OooO00o = uri;
            this.f13264OooO0O0 = str;
            this.f13265OooO0OO = oooO0o;
            this.f13266OooO0Oo = list;
            this.f13268OooO0o0 = str2;
            this.f13267OooO0o = list2;
            this.f13269OooO0oO = uri2;
            this.f13270OooO0oo = obj;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return this.f13263OooO00o.equals(oooO.f13263OooO00o) && o000OOo0.OooO00o(this.f13264OooO0O0, oooO.f13264OooO0O0) && o000OOo0.OooO00o(this.f13265OooO0OO, oooO.f13265OooO0OO) && this.f13266OooO0Oo.equals(oooO.f13266OooO0Oo) && o000OOo0.OooO00o(this.f13268OooO0o0, oooO.f13268OooO0o0) && this.f13267OooO0o.equals(oooO.f13267OooO0o) && o000OOo0.OooO00o(this.f13269OooO0oO, oooO.f13269OooO0oO) && o000OOo0.OooO00o(this.f13270OooO0oo, oooO.f13270OooO0oo);
        }

        public final int hashCode() {
            int iHashCode = this.f13263OooO00o.hashCode() * 31;
            String str = this.f13264OooO0O0;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            OooO0o oooO0o = this.f13265OooO0OO;
            int iHashCode3 = (this.f13266OooO0Oo.hashCode() + ((iHashCode2 + (oooO0o == null ? 0 : oooO0o.hashCode())) * 31)) * 31;
            String str2 = this.f13268OooO0o0;
            int iHashCode4 = (this.f13267OooO0o.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Uri uri = this.f13269OooO0oO;
            int iHashCode5 = (iHashCode4 + (uri == null ? 0 : uri.hashCode())) * 31;
            Object obj = this.f13270OooO0oo;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f13272OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Uri f13273OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String f13274OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f13275OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f13276OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f13277OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f13278OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public Uri f13279OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public UUID f13280OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f13281OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f13282OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f13284OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @Nullable
        public byte[] f13285OooOOOO;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @Nullable
        public String f13288OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @Nullable
        public Uri f13289OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public o000OO f13290OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @Nullable
        public Object f13291OooOo00;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public List<Integer> f13283OooOOO = Collections.emptyList();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Map<String, String> f13271OooO = Collections.emptyMap();

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public List<StreamKey> f13286OooOOOo = Collections.emptyList();

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public List<Object> f13287OooOOo = Collections.emptyList();

        public final OooOOO OooO00o() {
            o00000O0.OooO0Oo(this.f13279OooO0oo == null || this.f13280OooOO0 != null);
            Uri uri = this.f13273OooO0O0;
            OooO oooO = null;
            if (uri != null) {
                String str = this.f13274OooO0OO;
                UUID uuid = this.f13280OooOO0;
                OooO oooO2 = new OooO(uri, str, uuid != null ? new OooO0o(uuid, this.f13279OooO0oo, this.f13271OooO, this.f13281OooOO0O, this.f13284OooOOO0, this.f13282OooOO0o, this.f13283OooOOO, this.f13285OooOOOO, null) : null, this.f13286OooOOOo, this.f13288OooOOo0, this.f13287OooOOo, this.f13289OooOOoo, this.f13291OooOo00, null);
                String string = this.f13272OooO00o;
                if (string == null) {
                    string = this.f13273OooO0O0.toString();
                }
                this.f13272OooO00o = string;
                oooO = oooO2;
            }
            String str2 = this.f13272OooO00o;
            Objects.requireNonNull(str2);
            OooO0OO oooO0OO = new OooO0OO(this.f13275OooO0Oo, Long.MIN_VALUE, this.f13277OooO0o0, this.f13276OooO0o, this.f13278OooO0oO);
            o000OO o000oo2 = this.f13290OooOo0;
            if (o000oo2 == null) {
                o000oo2 = new o000OO();
            }
            return new OooOOO(str2, oooO0OO, oooO, o000oo2);
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f13292OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f13293OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f13294OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f13295OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f13296OooO0o0;

        public OooO0OO(long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f13292OooO00o = j;
            this.f13293OooO0O0 = j2;
            this.f13294OooO0OO = z;
            this.f13295OooO0Oo = z2;
            this.f13296OooO0o0 = z3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f13292OooO00o == oooO0OO.f13292OooO00o && this.f13293OooO0O0 == oooO0OO.f13293OooO0O0 && this.f13294OooO0OO == oooO0OO.f13294OooO0OO && this.f13295OooO0Oo == oooO0OO.f13295OooO0Oo && this.f13296OooO0o0 == oooO0OO.f13296OooO0o0;
        }

        public final int hashCode() {
            return ((((((Long.valueOf(this.f13293OooO0O0).hashCode() + (Long.valueOf(this.f13292OooO00o).hashCode() * 31)) * 31) + (this.f13294OooO0OO ? 1 : 0)) * 31) + (this.f13295OooO0Oo ? 1 : 0)) * 31) + (this.f13296OooO0o0 ? 1 : 0);
        }
    }

    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final UUID f13297OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Uri f13298OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Map<String, String> f13299OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f13300OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f13301OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f13302OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final List<Integer> f13303OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public final byte[] f13304OooO0oo;

        public OooO0o(UUID uuid, Uri uri, Map map, boolean z, boolean z2, boolean z3, List list, byte[] bArr, OooO00o oooO00o) {
            this.f13297OooO00o = uuid;
            this.f13298OooO0O0 = uri;
            this.f13299OooO0OO = map;
            this.f13300OooO0Oo = z;
            this.f13301OooO0o = z2;
            this.f13302OooO0o0 = z3;
            this.f13303OooO0oO = list;
            this.f13304OooO0oo = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0o)) {
                return false;
            }
            OooO0o oooO0o = (OooO0o) obj;
            return this.f13297OooO00o.equals(oooO0o.f13297OooO00o) && o000OOo0.OooO00o(this.f13298OooO0O0, oooO0o.f13298OooO0O0) && o000OOo0.OooO00o(this.f13299OooO0OO, oooO0o.f13299OooO0OO) && this.f13300OooO0Oo == oooO0o.f13300OooO0Oo && this.f13301OooO0o == oooO0o.f13301OooO0o && this.f13302OooO0o0 == oooO0o.f13302OooO0o0 && this.f13303OooO0oO.equals(oooO0o.f13303OooO0oO) && Arrays.equals(this.f13304OooO0oo, oooO0o.f13304OooO0oo);
        }

        public final int hashCode() {
            int iHashCode = this.f13297OooO00o.hashCode() * 31;
            Uri uri = this.f13298OooO0O0;
            return Arrays.hashCode(this.f13304OooO0oo) + ((this.f13303OooO0oO.hashCode() + ((((((((this.f13299OooO0OO.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f13300OooO0Oo ? 1 : 0)) * 31) + (this.f13301OooO0o ? 1 : 0)) * 31) + (this.f13302OooO0o0 ? 1 : 0)) * 31)) * 31);
        }
    }

    public OooOOO(String str, OooO0OO oooO0OO, OooO oooO, o000OO o000oo2) {
        this.f13259OooO00o = str;
        this.f13260OooO0O0 = oooO;
        this.f13261OooO0OO = o000oo2;
        this.f13262OooO0Oo = oooO0OO;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return o000OOo0.OooO00o(this.f13259OooO00o, oooOOO.f13259OooO00o) && this.f13262OooO0Oo.equals(oooOOO.f13262OooO0Oo) && o000OOo0.OooO00o(this.f13260OooO0O0, oooOOO.f13260OooO0O0) && o000OOo0.OooO00o(this.f13261OooO0OO, oooOOO.f13261OooO0OO);
    }

    public final int hashCode() {
        int iHashCode = this.f13259OooO00o.hashCode() * 31;
        OooO oooO = this.f13260OooO0O0;
        return this.f13261OooO0OO.hashCode() + ((this.f13262OooO0Oo.hashCode() + ((iHashCode + (oooO != null ? oooO.hashCode() : 0)) * 31)) * 31);
    }
}

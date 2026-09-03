package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.o0O00;
import com.google.common.collect.o0OoO00O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.ULong;
import p080o000OoO.o00;
import p080o000OoO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final C0139OooOOO0 f6483OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6484OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f6485OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final OooOO0O f6486OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final MediaMetadata f6487OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0o f6488OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooOOO0 f6475OooOO0 = new OooO0O0().OooO00o();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final String f6476OooOO0O = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final String f6477OooOO0o = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f6479OooOOO0 = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final String f6478OooOOO = o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final String f6480OooOOOO = o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final String f6481OooOOOo = o00.Oooo00o(5);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.animation.OooO f6482OooOOo0 = new androidx.compose.animation.OooO();

    public static final class OooO00o implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f6516OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final String f6515OooO0o0 = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.animation.OooOO0 f6514OooO0o = new androidx.compose.animation.OooOO0();

        /* JADX INFO: renamed from: androidx.media3.common.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0138OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Uri f6517OooO00o;

            public C0138OooO00o(Uri uri) {
                this.f6517OooO00o = uri;
            }
        }

        public OooO00o(C0138OooO00o c0138OooO00o) {
            this.f6516OooO0Oo = c0138OooO00o.f6517OooO00o;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO00o) {
                return this.f6516OooO0Oo.equals(((OooO00o) obj).f6516OooO0Oo) && o00.OooO00o(null, null);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f6516OooO0Oo.hashCode() * 31) + 0;
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f6515OooO0o0, this.f6516OooO0Oo);
            return bundle;
        }
    }

    public static class OooO0OO implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @IntRange(from = ULong.MIN_VALUE)
        public final long f6538OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final boolean f6539OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f6540OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f6541OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f6542OooO0oo;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooO0o f6531OooO = new OooO0o(new OooO00o());

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f6532OooOO0 = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f6533OooOO0O = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6534OooOO0o = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6536OooOOO0 = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6535OooOOO = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.animation.OooOO0O f6537OooOOOO = new androidx.compose.animation.OooOO0O();

        public OooO0OO(OooO00o oooO00o) {
            this.f6538OooO0Oo = oooO00o.f6543OooO00o;
            this.f6540OooO0o0 = oooO00o.f6544OooO0O0;
            this.f6539OooO0o = oooO00o.f6545OooO0OO;
            this.f6541OooO0oO = oooO00o.f6546OooO0Oo;
            this.f6542OooO0oo = oooO00o.f6547OooO0o0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.f6538OooO0Oo == oooO0OO.f6538OooO0Oo && this.f6540OooO0o0 == oooO0OO.f6540OooO0o0 && this.f6539OooO0o == oooO0OO.f6539OooO0o && this.f6541OooO0oO == oooO0OO.f6541OooO0oO && this.f6542OooO0oo == oooO0OO.f6542OooO0oo;
        }

        public final int hashCode() {
            long j = this.f6538OooO0Oo;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f6540OooO0o0;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f6539OooO0o ? 1 : 0)) * 31) + (this.f6541OooO0oO ? 1 : 0)) * 31) + (this.f6542OooO0oo ? 1 : 0);
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            OooO0o oooO0o = f6531OooO;
            long j = oooO0o.f6538OooO0Oo;
            long j2 = this.f6538OooO0Oo;
            if (j2 != j) {
                bundle.putLong(f6532OooOO0, j2);
            }
            long j3 = this.f6540OooO0o0;
            if (j3 != oooO0o.f6540OooO0o0) {
                bundle.putLong(f6533OooOO0O, j3);
            }
            boolean z = oooO0o.f6539OooO0o;
            boolean z2 = this.f6539OooO0o;
            if (z2 != z) {
                bundle.putBoolean(f6534OooOO0o, z2);
            }
            boolean z3 = oooO0o.f6541OooO0oO;
            boolean z4 = this.f6541OooO0oO;
            if (z4 != z3) {
                bundle.putBoolean(f6536OooOOO0, z4);
            }
            boolean z5 = oooO0o.f6542OooO0oo;
            boolean z6 = this.f6542OooO0oo;
            if (z6 != z5) {
                bundle.putBoolean(f6535OooOOO, z6);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public long f6543OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public long f6544OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public boolean f6545OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public boolean f6546OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public boolean f6547OooO0o0;

            public OooO00o() {
                this.f6544OooO0O0 = Long.MIN_VALUE;
            }

            public OooO00o(OooO0o oooO0o) {
                this.f6543OooO00o = oooO0o.f6538OooO0Oo;
                this.f6544OooO0O0 = oooO0o.f6540OooO0o0;
                this.f6545OooO0OO = oooO0o.f6539OooO0o;
                this.f6546OooO0Oo = oooO0o.f6541OooO0oO;
                this.f6547OooO0o0 = oooO0o.f6542OooO0oo;
            }
        }
    }

    @UnstableApi
    @Deprecated
    public static final class OooO0o extends OooO0OO {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final OooO0o f6548OooOOOo = new OooO0o(new OooO0OO.OooO00o());
    }

    public static final class OooOO0O implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        @UnstableApi
        public final String f6574OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f6575OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final OooO f6576OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final String f6577OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public final OooO00o f6578OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @UnstableApi
        public final List<StreamKey> f6579OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final ImmutableList<OooOOOO> f6580OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final Object f6581OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6566OooOO0o = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6568OooOOO0 = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6567OooOOO = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f6569OooOOOO = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f6570OooOOOo = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f6572OooOOo0 = o00.Oooo00o(5);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f6571OooOOo = o00.Oooo00o(6);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.animation.OooOOOO f6573OooOOoo = new androidx.compose.animation.OooOOOO();

        public OooOO0O(Uri uri, @Nullable String str, @Nullable OooO oooO, @Nullable OooO00o oooO00o, List<StreamKey> list, @Nullable String str2, ImmutableList<OooOOOO> immutableList, @Nullable Object obj) {
            this.f6575OooO0Oo = uri;
            this.f6577OooO0o0 = str;
            this.f6576OooO0o = oooO;
            this.f6578OooO0oO = oooO00o;
            this.f6579OooO0oo = list;
            this.f6574OooO = str2;
            this.f6580OooOO0 = immutableList;
            ImmutableList.OooO00o oooO00oOooOO0 = ImmutableList.OooOO0();
            for (int i = 0; i < immutableList.size(); i++) {
                oooO00oOooOO0.OooO0o0(OooOOOO.OooO00o.OooO00o(immutableList.get(i).OooO0OO()));
            }
            oooO00oOooOO0.OooO0oo();
            this.f6581OooOO0O = obj;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0O)) {
                return false;
            }
            OooOO0O oooOO0O = (OooOO0O) obj;
            return this.f6575OooO0Oo.equals(oooOO0O.f6575OooO0Oo) && o00.OooO00o(this.f6577OooO0o0, oooOO0O.f6577OooO0o0) && o00.OooO00o(this.f6576OooO0o, oooOO0O.f6576OooO0o) && o00.OooO00o(this.f6578OooO0oO, oooOO0O.f6578OooO0oO) && this.f6579OooO0oo.equals(oooOO0O.f6579OooO0oo) && o00.OooO00o(this.f6574OooO, oooOO0O.f6574OooO) && this.f6580OooOO0.equals(oooOO0O.f6580OooOO0) && o00.OooO00o(this.f6581OooOO0O, oooOO0O.f6581OooOO0O);
        }

        public final int hashCode() {
            int iHashCode = this.f6575OooO0Oo.hashCode() * 31;
            String str = this.f6577OooO0o0;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            OooO oooO = this.f6576OooO0o;
            int iHashCode3 = (iHashCode2 + (oooO == null ? 0 : oooO.hashCode())) * 31;
            OooO00o oooO00o = this.f6578OooO0oO;
            int iHashCode4 = (this.f6579OooO0oo.hashCode() + ((iHashCode3 + (oooO00o == null ? 0 : oooO00o.hashCode())) * 31)) * 31;
            String str2 = this.f6574OooO;
            int iHashCode5 = (this.f6580OooOO0.hashCode() + ((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f6581OooOO0O;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f6566OooOO0o, this.f6575OooO0Oo);
            String str = this.f6577OooO0o0;
            if (str != null) {
                bundle.putString(f6568OooOOO0, str);
            }
            OooO oooO = this.f6576OooO0o;
            if (oooO != null) {
                bundle.putBundle(f6567OooOOO, oooO.toBundle());
            }
            OooO00o oooO00o = this.f6578OooO0oO;
            if (oooO00o != null) {
                bundle.putBundle(f6569OooOOOO, oooO00o.toBundle());
            }
            List<StreamKey> list = this.f6579OooO0oo;
            if (!list.isEmpty()) {
                bundle.putParcelableArrayList(f6570OooOOOo, o00oO0o.OooO0O0(list));
            }
            String str2 = this.f6574OooO;
            if (str2 != null) {
                bundle.putString(f6572OooOOo0, str2);
            }
            ImmutableList<OooOOOO> immutableList = this.f6580OooOO0;
            if (!immutableList.isEmpty()) {
                bundle.putParcelableArrayList(f6571OooOOo, o00oO0o.OooO0O0(immutableList));
            }
            return bundle;
        }
    }

    @UnstableApi
    @Deprecated
    public static final class OooOOO extends OooOOOO {
    }

    /* JADX INFO: renamed from: androidx.media3.common.OooOOO0$OooOOO0, reason: collision with other inner class name */
    public static final class C0139OooOOO0 implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Uri f6587OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final Bundle f6588OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final String f6589OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final C0139OooOOO0 f6583OooO0oO = new C0139OooOOO0(new OooO00o());

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static final String f6584OooO0oo = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final String f6582OooO = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f6585OooOO0 = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @UnstableApi
        public static final p031OoooO0.o00Ooo f6586OooOO0O = new p031OoooO0.o00Ooo();

        /* JADX INFO: renamed from: androidx.media3.common.OooOOO0$OooOOO0$OooO00o */
        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public Uri f6590OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public String f6591OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @Nullable
            public Bundle f6592OooO0OO;
        }

        public C0139OooOOO0(OooO00o oooO00o) {
            this.f6587OooO0Oo = oooO00o.f6590OooO00o;
            this.f6589OooO0o0 = oooO00o.f6591OooO0O0;
            this.f6588OooO0o = oooO00o.f6592OooO0OO;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0139OooOOO0)) {
                return false;
            }
            C0139OooOOO0 c0139OooOOO0 = (C0139OooOOO0) obj;
            return o00.OooO00o(this.f6587OooO0Oo, c0139OooOOO0.f6587OooO0Oo) && o00.OooO00o(this.f6589OooO0o0, c0139OooOOO0.f6589OooO0o0);
        }

        public final int hashCode() {
            Uri uri = this.f6587OooO0Oo;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f6589OooO0o0;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f6587OooO0Oo;
            if (uri != null) {
                bundle.putParcelable(f6584OooO0oo, uri);
            }
            String str = this.f6589OooO0o0;
            if (str != null) {
                bundle.putString(f6582OooO, str);
            }
            Bundle bundle2 = this.f6588OooO0o;
            if (bundle2 != null) {
                bundle.putBundle(f6585OooOO0, bundle2);
            }
            return bundle;
        }
    }

    public static class OooOOOO implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final String f6601OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Uri f6602OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public final String f6603OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final String f6604OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final int f6605OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final int f6606OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public final String f6607OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f6593OooOO0O = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6594OooOO0o = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6596OooOOO0 = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6595OooOOO = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f6597OooOOOO = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f6598OooOOOo = o00.Oooo00o(5);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f6600OooOOo0 = o00.Oooo00o(6);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.ui.graphics.colorspace.OooO00o f6599OooOOo = new androidx.compose.ui.graphics.colorspace.OooO00o();

        public OooOOOO(OooO00o oooO00o) {
            this.f6602OooO0Oo = oooO00o.f6608OooO00o;
            this.f6604OooO0o0 = oooO00o.f6609OooO0O0;
            this.f6603OooO0o = oooO00o.f6610OooO0OO;
            this.f6605OooO0oO = oooO00o.f6611OooO0Oo;
            this.f6606OooO0oo = oooO00o.f6613OooO0o0;
            this.f6601OooO = oooO00o.f6612OooO0o;
            this.f6607OooOO0 = oooO00o.f6614OooO0oO;
        }

        public final OooO00o OooO0OO() {
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
            return this.f6602OooO0Oo.equals(oooOOOO.f6602OooO0Oo) && o00.OooO00o(this.f6604OooO0o0, oooOOOO.f6604OooO0o0) && o00.OooO00o(this.f6603OooO0o, oooOOOO.f6603OooO0o) && this.f6605OooO0oO == oooOOOO.f6605OooO0oO && this.f6606OooO0oo == oooOOOO.f6606OooO0oo && o00.OooO00o(this.f6601OooO, oooOOOO.f6601OooO) && o00.OooO00o(this.f6607OooOO0, oooOOOO.f6607OooOO0);
        }

        public final int hashCode() {
            int iHashCode = this.f6602OooO0Oo.hashCode() * 31;
            String str = this.f6604OooO0o0;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f6603OooO0o;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f6605OooO0oO) * 31) + this.f6606OooO0oo) * 31;
            String str3 = this.f6601OooO;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f6607OooOO0;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f6593OooOO0O, this.f6602OooO0Oo);
            String str = this.f6604OooO0o0;
            if (str != null) {
                bundle.putString(f6594OooOO0o, str);
            }
            String str2 = this.f6603OooO0o;
            if (str2 != null) {
                bundle.putString(f6596OooOOO0, str2);
            }
            int i = this.f6605OooO0oO;
            if (i != 0) {
                bundle.putInt(f6595OooOOO, i);
            }
            int i2 = this.f6606OooO0oo;
            if (i2 != 0) {
                bundle.putInt(f6597OooOOOO, i2);
            }
            String str3 = this.f6601OooO;
            if (str3 != null) {
                bundle.putString(f6598OooOOOo, str3);
            }
            String str4 = this.f6607OooOO0;
            if (str4 != null) {
                bundle.putString(f6600OooOOo0, str4);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final Uri f6608OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public String f6609OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            @Nullable
            public String f6610OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f6611OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            @Nullable
            public String f6612OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public int f6613OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            @Nullable
            public String f6614OooO0oO;

            public OooO00o(Uri uri) {
                this.f6608OooO00o = uri;
            }

            public static OooOOO OooO00o(OooO00o oooO00o) {
                return new OooOOO(oooO00o);
            }

            public OooO00o(OooOOOO oooOOOO) {
                this.f6608OooO00o = oooOOOO.f6602OooO0Oo;
                this.f6609OooO0O0 = oooOOOO.f6604OooO0o0;
                this.f6610OooO0OO = oooOOOO.f6603OooO0o;
                this.f6611OooO0Oo = oooOOOO.f6605OooO0oO;
                this.f6613OooO0o0 = oooOOOO.f6606OooO0oo;
                this.f6612OooO0o = oooOOOO.f6601OooO;
                this.f6614OooO0oO = oooOOOO.f6607OooOO0;
            }
        }
    }

    public OooOOO0(String str, OooO0o oooO0o, @Nullable OooOO0O oooOO0O, OooOO0 oooOO1, MediaMetadata mediaMetadata, C0139OooOOO0 c0139OooOOO0) {
        this.f6484OooO0Oo = str;
        this.f6486OooO0o0 = oooOO0O;
        this.f6485OooO0o = oooOO1;
        this.f6487OooO0oO = mediaMetadata;
        this.f6488OooO0oo = oooO0o;
        this.f6483OooO = c0139OooOOO0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return o00.OooO00o(this.f6484OooO0Oo, oooOOO0.f6484OooO0Oo) && this.f6488OooO0oo.equals(oooOOO0.f6488OooO0oo) && o00.OooO00o(this.f6486OooO0o0, oooOOO0.f6486OooO0o0) && o00.OooO00o(this.f6485OooO0o, oooOOO0.f6485OooO0o) && o00.OooO00o(this.f6487OooO0oO, oooOOO0.f6487OooO0oO) && o00.OooO00o(this.f6483OooO, oooOOO0.f6483OooO);
    }

    public final int hashCode() {
        int iHashCode = this.f6484OooO0Oo.hashCode() * 31;
        OooOO0O oooOO0O = this.f6486OooO0o0;
        return this.f6483OooO.hashCode() + ((this.f6487OooO0oO.hashCode() + ((this.f6488OooO0oo.hashCode() + ((this.f6485OooO0o.hashCode() + ((iHashCode + (oooOO0O != null ? oooOO0O.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.f6484OooO0Oo;
        if (!str.equals("")) {
            bundle.putString(f6476OooOO0O, str);
        }
        OooOO0 oooOO1 = OooOO0.f6549OooO;
        OooOO0 oooOO2 = this.f6485OooO0o;
        if (!oooOO2.equals(oooOO1)) {
            bundle.putBundle(f6477OooOO0o, oooOO2.toBundle());
        }
        MediaMetadata mediaMetadata = MediaMetadata.f6236Oooo0o0;
        MediaMetadata mediaMetadata2 = this.f6487OooO0oO;
        if (!mediaMetadata2.equals(mediaMetadata)) {
            bundle.putBundle(f6479OooOOO0, mediaMetadata2.toBundle());
        }
        OooO0o oooO0o = OooO0OO.f6531OooO;
        OooO0o oooO0o2 = this.f6488OooO0oo;
        if (!oooO0o2.equals(oooO0o)) {
            bundle.putBundle(f6478OooOOO, oooO0o2.toBundle());
        }
        C0139OooOOO0 c0139OooOOO0 = C0139OooOOO0.f6583OooO0oO;
        C0139OooOOO0 c0139OooOOO1 = this.f6483OooO;
        if (!c0139OooOOO1.equals(c0139OooOOO0)) {
            bundle.putBundle(f6480OooOOOO, c0139OooOOO1.toBundle());
        }
        return bundle;
    }

    public static final class OooOO0 implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f6556OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final long f6557OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f6558OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final float f6559OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final float f6560OooO0oo;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static final OooOO0 f6549OooO = new OooOO0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static final String f6550OooOO0 = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final String f6551OooOO0O = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6552OooOO0o = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6554OooOOO0 = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6553OooOOO = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.animation.OooOOO f6555OooOOOO = new androidx.compose.animation.OooOOO();

        @UnstableApi
        @Deprecated
        public OooOO0(long j, long j2, long j3, float f, float f2) {
            this.f6556OooO0Oo = j;
            this.f6558OooO0o0 = j2;
            this.f6557OooO0o = j3;
            this.f6559OooO0oO = f;
            this.f6560OooO0oo = f2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOO0)) {
                return false;
            }
            OooOO0 oooOO1 = (OooOO0) obj;
            return this.f6556OooO0Oo == oooOO1.f6556OooO0Oo && this.f6558OooO0o0 == oooOO1.f6558OooO0o0 && this.f6557OooO0o == oooOO1.f6557OooO0o && this.f6559OooO0oO == oooOO1.f6559OooO0oO && this.f6560OooO0oo == oooOO1.f6560OooO0oo;
        }

        public final int hashCode() {
            long j = this.f6556OooO0Oo;
            long j2 = this.f6558OooO0o0;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f6557OooO0o;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f6559OooO0oO;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f6560OooO0oo;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f6556OooO0Oo;
            if (j != -9223372036854775807L) {
                bundle.putLong(f6550OooOO0, j);
            }
            long j2 = this.f6558OooO0o0;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f6551OooOO0O, j2);
            }
            long j3 = this.f6557OooO0o;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f6552OooOO0o, j3);
            }
            float f = this.f6559OooO0oO;
            if (f != -3.4028235E38f) {
                bundle.putFloat(f6554OooOOO0, f);
            }
            float f2 = this.f6560OooO0oo;
            if (f2 != -3.4028235E38f) {
                bundle.putFloat(f6553OooOOO, f2);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public long f6561OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public long f6562OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public long f6563OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public float f6564OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public float f6565OooO0o0;

            public OooO00o() {
                this.f6561OooO00o = -9223372036854775807L;
                this.f6562OooO0O0 = -9223372036854775807L;
                this.f6563OooO0OO = -9223372036854775807L;
                this.f6564OooO0Oo = -3.4028235E38f;
                this.f6565OooO0o0 = -3.4028235E38f;
            }

            public OooO00o(OooOO0 oooOO1) {
                this.f6561OooO00o = oooOO1.f6556OooO0Oo;
                this.f6562OooO0O0 = oooOO1.f6558OooO0o0;
                this.f6563OooO0OO = oooOO1.f6557OooO0o;
                this.f6564OooO0Oo = oooOO1.f6559OooO0oO;
                this.f6565OooO0o0 = oooOO1.f6560OooO0oo;
            }
        }
    }

    public static final class OooO implements androidx.media3.common.OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final boolean f6498OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final UUID f6499OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final ImmutableMap<String, String> f6500OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Uri f6501OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f6502OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f6503OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final ImmutableList<Integer> f6504OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public final byte[] f6505OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final String f6489OooOO0o = o00.Oooo00o(0);

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public static final String f6491OooOOO0 = o00.Oooo00o(1);

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public static final String f6490OooOOO = o00.Oooo00o(2);

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public static final String f6492OooOOOO = o00.Oooo00o(3);

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final String f6493OooOOOo = o00.Oooo00o(4);

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public static final String f6495OooOOo0 = o00.Oooo00o(5);

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public static final String f6494OooOOo = o00.Oooo00o(6);

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public static final String f6496OooOOoo = o00.Oooo00o(7);

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        @UnstableApi
        public static final androidx.compose.animation.OooOOO0 f6497OooOo00 = new androidx.compose.animation.OooOOO0();

        public OooO(OooO00o oooO00o) {
            p080o000OoO.o00Oo0.OooO0Oo((oooO00o.f6510OooO0o && oooO00o.f6507OooO0O0 == null) ? false : true);
            UUID uuid = oooO00o.f6506OooO00o;
            uuid.getClass();
            this.f6499OooO0Oo = uuid;
            this.f6501OooO0o0 = oooO00o.f6507OooO0O0;
            this.f6500OooO0o = oooO00o.f6508OooO0OO;
            this.f6502OooO0oO = oooO00o.f6509OooO0Oo;
            this.f6498OooO = oooO00o.f6510OooO0o;
            this.f6503OooO0oo = oooO00o.f6511OooO0o0;
            this.f6504OooOO0 = oooO00o.f6512OooO0oO;
            byte[] bArr = oooO00o.f6513OooO0oo;
            this.f6505OooOO0O = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO)) {
                return false;
            }
            OooO oooO = (OooO) obj;
            return this.f6499OooO0Oo.equals(oooO.f6499OooO0Oo) && o00.OooO00o(this.f6501OooO0o0, oooO.f6501OooO0o0) && o00.OooO00o(this.f6500OooO0o, oooO.f6500OooO0o) && this.f6502OooO0oO == oooO.f6502OooO0oO && this.f6498OooO == oooO.f6498OooO && this.f6503OooO0oo == oooO.f6503OooO0oo && this.f6504OooOO0.equals(oooO.f6504OooOO0) && Arrays.equals(this.f6505OooOO0O, oooO.f6505OooOO0O);
        }

        public final int hashCode() {
            int iHashCode = this.f6499OooO0Oo.hashCode() * 31;
            Uri uri = this.f6501OooO0o0;
            return Arrays.hashCode(this.f6505OooOO0O) + ((this.f6504OooOO0.hashCode() + ((((((((this.f6500OooO0o.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f6502OooO0oO ? 1 : 0)) * 31) + (this.f6498OooO ? 1 : 0)) * 31) + (this.f6503OooO0oo ? 1 : 0)) * 31)) * 31);
        }

        @Override // androidx.media3.common.OooO0OO
        @UnstableApi
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f6489OooOO0o, this.f6499OooO0Oo.toString());
            Uri uri = this.f6501OooO0o0;
            if (uri != null) {
                bundle.putParcelable(f6491OooOOO0, uri);
            }
            ImmutableMap<String, String> immutableMap = this.f6500OooO0o;
            if (!immutableMap.isEmpty()) {
                Bundle bundle2 = new Bundle();
                for (Map.Entry<String, String> entry : immutableMap.entrySet()) {
                    bundle2.putString(entry.getKey(), entry.getValue());
                }
                bundle.putBundle(f6490OooOOO, bundle2);
            }
            boolean z = this.f6502OooO0oO;
            if (z) {
                bundle.putBoolean(f6492OooOOOO, z);
            }
            boolean z2 = this.f6503OooO0oo;
            if (z2) {
                bundle.putBoolean(f6493OooOOOo, z2);
            }
            boolean z3 = this.f6498OooO;
            if (z3) {
                bundle.putBoolean(f6495OooOOo0, z3);
            }
            ImmutableList<Integer> immutableList = this.f6504OooOO0;
            if (!immutableList.isEmpty()) {
                bundle.putIntegerArrayList(f6494OooOOo, new ArrayList<>(immutableList));
            }
            byte[] bArr = this.f6505OooOO0O;
            if (bArr != null) {
                bundle.putByteArray(f6496OooOOoo, bArr);
            }
            return bundle;
        }

        public static final class OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @Nullable
            public final UUID f6506OooO00o;

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            @Nullable
            public Uri f6507OooO0O0;

            /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
            public ImmutableMap<String, String> f6508OooO0OO;

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public boolean f6509OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public boolean f6510OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public boolean f6511OooO0o0;

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public ImmutableList<Integer> f6512OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            @Nullable
            public byte[] f6513OooO0oo;

            public OooO00o(UUID uuid) {
                this.f6506OooO00o = uuid;
                this.f6508OooO0OO = o0OoO00O.f19150OooOO0;
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
                this.f6512OooO0oO = o0O00.f19060OooO0oo;
            }

            public OooO00o() {
                this.f6508OooO0OO = o0OoO00O.f19150OooOO0;
                ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
                this.f6512OooO0oO = o0O00.f19060OooO0oo;
            }

            public OooO00o(OooO oooO) {
                this.f6506OooO00o = oooO.f6499OooO0Oo;
                this.f6507OooO0O0 = oooO.f6501OooO0o0;
                this.f6508OooO0OO = oooO.f6500OooO0o;
                this.f6509OooO0Oo = oooO.f6502OooO0oO;
                this.f6511OooO0o0 = oooO.f6503OooO0oo;
                this.f6510OooO0o = oooO.f6498OooO;
                this.f6512OooO0oO = oooO.f6504OooOO0;
                this.f6513OooO0oo = oooO.f6505OooOO0O;
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public final OooO00o f6518OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f6519OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public Uri f6520OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public final String f6521OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0OO.OooO00o f6522OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public List<StreamKey> f6523OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO.OooO00o f6524OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public String f6525OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public ImmutableList<OooOOOO> f6526OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public Object f6527OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public MediaMetadata f6528OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public OooOO0.OooO00o f6529OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public C0139OooOOO0 f6530OooOOO0;

        public OooO0O0() {
            this.f6522OooO0Oo = new OooO0OO.OooO00o();
            this.f6524OooO0o0 = new OooO.OooO00o();
            this.f6523OooO0o = Collections.emptyList();
            this.f6526OooO0oo = o0O00.f19060OooO0oo;
            this.f6529OooOO0o = new OooOO0.OooO00o();
            this.f6530OooOOO0 = C0139OooOOO0.f6583OooO0oO;
        }

        public final OooOOO0 OooO00o() {
            OooOO0O oooOO0O;
            OooO.OooO00o oooO00o = this.f6524OooO0o0;
            p080o000OoO.o00Oo0.OooO0Oo(oooO00o.f6507OooO0O0 == null || oooO00o.f6506OooO00o != null);
            Uri uri = this.f6520OooO0O0;
            if (uri != null) {
                String str = this.f6521OooO0OO;
                OooO.OooO00o oooO00o2 = this.f6524OooO0o0;
                oooOO0O = new OooOO0O(uri, str, oooO00o2.f6506OooO00o != null ? new OooO(oooO00o2) : null, this.f6518OooO, this.f6523OooO0o, this.f6525OooO0oO, this.f6526OooO0oo, this.f6527OooOO0);
            } else {
                oooOO0O = null;
            }
            String str2 = this.f6519OooO00o;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            OooO0OO.OooO00o oooO00o3 = this.f6522OooO0Oo;
            oooO00o3.getClass();
            OooO0o oooO0o = new OooO0o(oooO00o3);
            OooOO0.OooO00o oooO00o4 = this.f6529OooOO0o;
            oooO00o4.getClass();
            OooOO0 oooOO1 = new OooOO0(oooO00o4.f6561OooO00o, oooO00o4.f6562OooO0O0, oooO00o4.f6563OooO0OO, oooO00o4.f6564OooO0Oo, oooO00o4.f6565OooO0o0);
            MediaMetadata mediaMetadata = this.f6528OooOO0O;
            if (mediaMetadata == null) {
                mediaMetadata = MediaMetadata.f6236Oooo0o0;
            }
            return new OooOOO0(str3, oooO0o, oooOO0O, oooOO1, mediaMetadata, this.f6530OooOOO0);
        }

        public OooO0O0(OooOOO0 oooOOO0) {
            OooO.OooO00o oooO00o;
            this();
            OooO0o oooO0o = oooOOO0.f6488OooO0oo;
            oooO0o.getClass();
            this.f6522OooO0Oo = new OooO0OO.OooO00o(oooO0o);
            this.f6519OooO00o = oooOOO0.f6484OooO0Oo;
            this.f6528OooOO0O = oooOOO0.f6487OooO0oO;
            OooOO0 oooOO1 = oooOOO0.f6485OooO0o;
            oooOO1.getClass();
            this.f6529OooOO0o = new OooOO0.OooO00o(oooOO1);
            this.f6530OooOOO0 = oooOOO0.f6483OooO;
            OooOO0O oooOO0O = oooOOO0.f6486OooO0o0;
            if (oooOO0O != null) {
                this.f6525OooO0oO = oooOO0O.f6574OooO;
                this.f6521OooO0OO = oooOO0O.f6577OooO0o0;
                this.f6520OooO0O0 = oooOO0O.f6575OooO0Oo;
                this.f6523OooO0o = oooOO0O.f6579OooO0oo;
                this.f6526OooO0oo = oooOO0O.f6580OooOO0;
                this.f6527OooOO0 = oooOO0O.f6581OooOO0O;
                OooO oooO = oooOO0O.f6576OooO0o;
                if (oooO != null) {
                    oooO00o = new OooO.OooO00o(oooO);
                } else {
                    oooO00o = new OooO.OooO00o();
                }
                this.f6524OooO0o0 = oooO00o;
                this.f6518OooO = oooOO0O.f6578OooO0oO;
            }
        }
    }
}

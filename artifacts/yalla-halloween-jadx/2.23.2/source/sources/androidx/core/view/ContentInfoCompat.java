package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooO f5322OooO00o;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Flags {
    }

    public interface OooO {
        @Nullable
        ContentInfo OooO00o();

        int OooO0O0();

        @NonNull
        ClipData getClip();

        int getSource();
    }

    @RequiresApi(31)
    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ContentInfo.Builder f5323OooO00o;

        public OooO00o(@NonNull ClipData clipData, int i) {
            this.f5323OooO00o = androidx.core.view.OooOO0.OooO00o(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO00o(@Nullable Uri uri) {
            this.f5323OooO00o.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO0O0(int i) {
            this.f5323OooO00o.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        @NonNull
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new OooO0o(this.f5323OooO00o.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void setExtras(@Nullable Bundle bundle) {
            this.f5323OooO00o.setExtras(bundle);
        }
    }

    public interface OooO0O0 {
        void OooO00o(@Nullable Uri uri);

        void OooO0O0(int i);

        @NonNull
        ContentInfoCompat build();

        void setExtras(@Nullable Bundle bundle);
    }

    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ClipData f5324OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f5325OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f5326OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Uri f5327OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Bundle f5328OooO0o0;

        public OooO0OO(@NonNull ClipData clipData, int i) {
            this.f5324OooO00o = clipData;
            this.f5325OooO0O0 = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO00o(@Nullable Uri uri) {
            this.f5327OooO0Oo = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO0O0(int i) {
            this.f5326OooO0OO = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        @NonNull
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new OooOO0(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void setExtras(@Nullable Bundle bundle) {
            this.f5328OooO0o0 = bundle;
        }
    }

    @RequiresApi(31)
    public static final class OooO0o implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ContentInfo f5329OooO00o;

        public OooO0o(@NonNull ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f5329OooO00o = androidx.core.view.OooO0OO.OooO00o(contentInfo);
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @NonNull
        public final ContentInfo OooO00o() {
            return this.f5329OooO00o;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int OooO0O0() {
            return this.f5329OooO00o.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @NonNull
        public final ClipData getClip() {
            return this.f5329OooO00o.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int getSource() {
            return this.f5329OooO00o.getSource();
        }

        @NonNull
        public final String toString() {
            return "ContentInfoCompat{" + this.f5329OooO00o + "}";
        }
    }

    public static final class OooOO0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ClipData f5330OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f5331OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f5332OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Uri f5333OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Bundle f5334OooO0o0;

        public OooOO0(OooO0OO oooO0OO) {
            ClipData clipData = oooO0OO.f5324OooO00o;
            clipData.getClass();
            this.f5330OooO00o = clipData;
            int i = oooO0OO.f5325OooO0O0;
            o000OO.OooOOO0.OooO0OO(i, 0, 5, "source");
            this.f5331OooO0O0 = i;
            int i2 = oooO0OO.f5326OooO0OO;
            if ((i2 & 1) == i2) {
                this.f5332OooO0OO = i2;
                this.f5333OooO0Oo = oooO0OO.f5327OooO0Oo;
                this.f5334OooO0o0 = oooO0OO.f5328OooO0o0;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @Nullable
        public final ContentInfo OooO00o() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int OooO0O0() {
            return this.f5332OooO0OO;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @NonNull
        public final ClipData getClip() {
            return this.f5330OooO00o;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int getSource() {
            return this.f5331OooO0O0;
        }

        @NonNull
        public final String toString() {
            String strValueOf;
            String str;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f5330OooO00o.getDescription());
            sb.append(", source=");
            int i = this.f5331OooO0O0;
            if (i == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i != 4) {
                strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sb.append(strValueOf);
            sb.append(", flags=");
            int i2 = this.f5332OooO0OO;
            sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            Uri uri = this.f5333OooO0Oo;
            if (uri == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str);
            return p028Oooo0oO.o0oOO.OooO0O0(sb, this.f5334OooO0o0 != null ? ", hasExtras" : "", "}");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Source {
    }

    public ContentInfoCompat(@NonNull OooO oooO) {
        this.f5322OooO00o = oooO;
    }

    @NonNull
    public final String toString() {
        return this.f5322OooO00o.toString();
    }
}

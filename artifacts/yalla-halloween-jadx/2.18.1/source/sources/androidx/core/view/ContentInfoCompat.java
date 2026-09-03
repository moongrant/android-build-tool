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
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInfoCompat {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final OooO f7848OooO00o;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Flags {
    }

    public interface OooO {
        @NonNull
        ClipData OooO00o();

        int OooO0O0();

        @Nullable
        ContentInfo OooO0OO();

        int getSource();
    }

    @RequiresApi(31)
    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ContentInfo.Builder f7849OooO00o;

        public OooO00o(@NonNull ClipData clipData, int i) {
            this.f7849OooO00o = new ContentInfo.Builder(clipData, i);
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO00o(@Nullable Uri uri) {
            this.f7849OooO00o.setLinkUri(uri);
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO0O0(int i) {
            this.f7849OooO00o.setFlags(i);
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        @NonNull
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new OooO0o(this.f7849OooO00o.build()));
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void setExtras(@Nullable Bundle bundle) {
            this.f7849OooO00o.setExtras(bundle);
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
        public ClipData f7850OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7851OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7852OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public Uri f7853OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Bundle f7854OooO0o0;

        public OooO0OO(@NonNull ClipData clipData, int i) {
            this.f7850OooO00o = clipData;
            this.f7851OooO0O0 = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO00o(@Nullable Uri uri) {
            this.f7853OooO0Oo = uri;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void OooO0O0(int i) {
            this.f7852OooO0OO = i;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        @NonNull
        public final ContentInfoCompat build() {
            return new ContentInfoCompat(new OooOO0(this));
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO0O0
        public final void setExtras(@Nullable Bundle bundle) {
            this.f7854OooO0o0 = bundle;
        }
    }

    @RequiresApi(31)
    public static final class OooO0o implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ContentInfo f7855OooO00o;

        public OooO0o(@NonNull ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f7855OooO00o = contentInfo;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @NonNull
        public final ClipData OooO00o() {
            return this.f7855OooO00o.getClip();
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int OooO0O0() {
            return this.f7855OooO00o.getFlags();
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @NonNull
        public final ContentInfo OooO0OO() {
            return this.f7855OooO00o;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int getSource() {
            return this.f7855OooO00o.getSource();
        }

        @NonNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ContentInfoCompat{");
            sbOooO0o0.append(this.f7855OooO00o);
            sbOooO0o0.append("}");
            return sbOooO0o0.toString();
        }
    }

    public static final class OooOO0 implements OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final ClipData f7856OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7857OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7858OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final Uri f7859OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final Bundle f7860OooO0o0;

        public OooOO0(OooO0OO oooO0OO) {
            ClipData clipData = oooO0OO.f7850OooO00o;
            Objects.requireNonNull(clipData);
            this.f7856OooO00o = clipData;
            int i = oooO0OO.f7851OooO0O0;
            if (i < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f7857OooO0O0 = i;
            int i2 = oooO0OO.f7852OooO0OO;
            if ((i2 & 1) == i2) {
                this.f7858OooO0OO = i2;
                this.f7859OooO0Oo = oooO0OO.f7853OooO0Oo;
                this.f7860OooO0o0 = oooO0OO.f7854OooO0o0;
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Requested flags 0x");
                sbOooO0o0.append(Integer.toHexString(i2));
                sbOooO0o0.append(", but only 0x");
                sbOooO0o0.append(Integer.toHexString(1));
                sbOooO0o0.append(" are allowed");
                throw new IllegalArgumentException(sbOooO0o0.toString());
            }
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @NonNull
        public final ClipData OooO00o() {
            return this.f7856OooO00o;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int OooO0O0() {
            return this.f7858OooO0OO;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        @Nullable
        public final ContentInfo OooO0OO() {
            return null;
        }

        @Override // androidx.core.view.ContentInfoCompat.OooO
        public final int getSource() {
            return this.f7857OooO0O0;
        }

        @NonNull
        public final String toString() {
            String strValueOf;
            String string;
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ContentInfoCompat{clip=");
            sbOooO0o0.append(this.f7856OooO00o.getDescription());
            sbOooO0o0.append(", source=");
            int i = this.f7857OooO0O0;
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
            sbOooO0o0.append(strValueOf);
            sbOooO0o0.append(", flags=");
            int i2 = this.f7858OooO0OO;
            sbOooO0o0.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
            if (this.f7859OooO0Oo == null) {
                string = "";
            } else {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(", hasLinkUri(");
                sbOooO0o1.append(this.f7859OooO0Oo.toString().length());
                sbOooO0o1.append(")");
                string = sbOooO0o1.toString();
            }
            sbOooO0o0.append(string);
            return p058o0000OoO.OooO.OooO00o(sbOooO0o0, this.f7860OooO0o0 != null ? ", hasExtras" : "", "}");
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Source {
    }

    public ContentInfoCompat(@NonNull OooO oooO) {
        this.f7848OooO00o = oooO;
    }

    @NonNull
    public final String toString() {
        return this.f7848OooO00o.toString();
    }
}

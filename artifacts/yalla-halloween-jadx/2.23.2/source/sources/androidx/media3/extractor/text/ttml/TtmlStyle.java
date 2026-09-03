package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes2.dex */
public final class TtmlStyle {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public String f8828OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f8829OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f8830OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f8831OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f8833OooO0o0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f8837OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public String f8838OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f8841OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public Layout.Alignment f8842OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public TextEmphasis f8843OooOOo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f8832OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f8834OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f8835OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f8827OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f8836OooOO0 = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f8840OooOOO0 = -1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f8839OooOOO = -1;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8844OooOOo0 = -1;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public float f8845OooOOoo = Float.MAX_VALUE;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FontSizeUnit {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RubyType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StyleFlags {
    }

    @CanIgnoreReturnValue
    public final void OooO00o(@Nullable TtmlStyle ttmlStyle) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ttmlStyle != null) {
            if (!this.f8830OooO0OO && ttmlStyle.f8830OooO0OO) {
                this.f8829OooO0O0 = ttmlStyle.f8829OooO0O0;
                this.f8830OooO0OO = true;
            }
            if (this.f8835OooO0oo == -1) {
                this.f8835OooO0oo = ttmlStyle.f8835OooO0oo;
            }
            if (this.f8827OooO == -1) {
                this.f8827OooO = ttmlStyle.f8827OooO;
            }
            if (this.f8828OooO00o == null && (str = ttmlStyle.f8828OooO00o) != null) {
                this.f8828OooO00o = str;
            }
            if (this.f8832OooO0o == -1) {
                this.f8832OooO0o = ttmlStyle.f8832OooO0o;
            }
            if (this.f8834OooO0oO == -1) {
                this.f8834OooO0oO = ttmlStyle.f8834OooO0oO;
            }
            if (this.f8839OooOOO == -1) {
                this.f8839OooOOO = ttmlStyle.f8839OooOOO;
            }
            if (this.f8841OooOOOO == null && (alignment2 = ttmlStyle.f8841OooOOOO) != null) {
                this.f8841OooOOOO = alignment2;
            }
            if (this.f8842OooOOOo == null && (alignment = ttmlStyle.f8842OooOOOo) != null) {
                this.f8842OooOOOo = alignment;
            }
            if (this.f8844OooOOo0 == -1) {
                this.f8844OooOOo0 = ttmlStyle.f8844OooOOo0;
            }
            if (this.f8836OooOO0 == -1) {
                this.f8836OooOO0 = ttmlStyle.f8836OooOO0;
                this.f8837OooOO0O = ttmlStyle.f8837OooOO0O;
            }
            if (this.f8843OooOOo == null) {
                this.f8843OooOOo = ttmlStyle.f8843OooOOo;
            }
            if (this.f8845OooOOoo == Float.MAX_VALUE) {
                this.f8845OooOOoo = ttmlStyle.f8845OooOOoo;
            }
            if (!this.f8833OooO0o0 && ttmlStyle.f8833OooO0o0) {
                this.f8831OooO0Oo = ttmlStyle.f8831OooO0Oo;
                this.f8833OooO0o0 = true;
            }
            if (this.f8840OooOOO0 != -1 || (i = ttmlStyle.f8840OooOOO0) == -1) {
                return;
            }
            this.f8840OooOOO0 = i;
        }
    }
}

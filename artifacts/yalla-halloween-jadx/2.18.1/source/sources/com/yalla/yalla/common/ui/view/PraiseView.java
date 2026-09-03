package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p516o0o0O000.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/common/ui/view/PraiseView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PraiseView extends AppCompatImageView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f20995Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o00Oo0 f20996OoooO00;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PraiseView.this.setEnabled(false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PraiseView praiseView = PraiseView.this;
            if (praiseView.f20995Oooo) {
                praiseView.setImageResource(R.drawable.icon_praise_red_140_01);
            } else {
                praiseView.setImageResource(R.drawable.icon_praise_gray_140);
            }
            PraiseView.this.setEnabled(true);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PraiseView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO0OO(boolean z) {
        o00Oo0 o00oo1 = this.f20996OoooO00;
        if (o00oo1 != null) {
            o00oo1.f42082OooO0o = o00oo1.f42083OooO0o0;
        }
        this.f20995Oooo = z;
        if (z) {
            setImageResource(R.drawable.icon_praise_red_140_01);
        } else {
            setImageResource(R.drawable.icon_praise_gray_140);
        }
    }

    public final void OooO0Oo(boolean z) {
        this.f20995Oooo = z;
        if (!z) {
            o00Oo0 o00oo1 = this.f20996OoooO00;
            if (o00oo1 != null) {
                o00oo1.f42082OooO0o = o00oo1.f42083OooO0o0;
            }
            setImageResource(R.drawable.icon_praise_gray_140);
            return;
        }
        if (this.f20996OoooO00 == null) {
            o00Oo0 o00oo2 = new o00Oo0(this, R.array.praise_img, 660L, false);
            this.f20996OoooO00 = o00oo2;
            OooO00o oooO00o = new OooO00o();
            OooO0O0 oooO0O0 = new OooO0O0();
            o00oo2.f42085OooO0oo = oooO00o;
            o00oo2.f42077OooO = null;
            o00oo2.f42086OooOO0 = null;
            o00oo2.f42087OooOO0O = oooO0O0;
        }
        o00Oo0 o00oo3 = this.f20996OoooO00;
        if (o00oo3 != null) {
            o00oo3.OooO0O0();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PraiseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PraiseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

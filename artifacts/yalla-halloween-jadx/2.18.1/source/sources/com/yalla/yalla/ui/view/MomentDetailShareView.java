package com.yalla.yalla.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.model.MomentType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.md;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailShareView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentDetailShareView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final md f24911Oooo0o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailShareView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(@NotNull FragmentActivity activity, @NotNull MomentDetailModel itemData) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        if (itemData.getType() == MomentType.Share.getValue()) {
            MomentForwardContent forwardContent = itemData.getForwardContent();
            if (forwardContent == null) {
                oOO00O.OooO00o(this);
                return;
            }
            oOO00O.OooO(this);
            if (!TextUtils.isEmpty(forwardContent.getImage())) {
                this.f24911Oooo0o.f50024OooO0O0.setVisibility(0);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
                oooO00o.OooO0oO(4);
                oooO00o.f48429OooO0OO = forwardContent.getImage();
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(this.f24911Oooo0o.f50024OooO0O0);
            }
            if (!TextUtils.isEmpty(forwardContent.getName())) {
                this.f24911Oooo0o.f50026OooO0Oo.setVisibility(0);
                this.f24911Oooo0o.f50026OooO0Oo.setText(forwardContent.getName());
            }
            if (TextUtils.isEmpty(forwardContent.getContent())) {
                return;
            }
            this.f24911Oooo0o.f50025OooO0OO.setVisibility(0);
            this.f24911Oooo0o.f50025OooO0OO.setText(forwardContent.getContent());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailShareView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailShareView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        md mdVarInflate = md.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(mdVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24911Oooo0o = mdVarInflate;
    }
}

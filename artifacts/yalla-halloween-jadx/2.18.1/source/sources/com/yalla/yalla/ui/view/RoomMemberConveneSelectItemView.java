package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p649o0ooOOoo.zg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/view/RoomMemberConveneSelectItemView;", "Landroid/widget/FrameLayout;", "", "Oooo0oO", "Z", "getConvening", "()Z", "setConvening", "(Z)V", "convening", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "def", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomMemberConveneSelectItemView extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final /* synthetic */ int f25117Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public zg f25118Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public boolean convening;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomMemberConveneSelectItemView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        zg zgVarInflate = zg.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(zgVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25118Oooo0o = zgVarInflate;
    }

    public final void OooO00o(boolean z) {
        if (z) {
            this.f25118Oooo0o.f51099OooO.setImageResource(R.drawable.room_ic_remove_member_select_green);
        } else {
            this.f25118Oooo0o.f51099OooO.setImageResource(R.drawable.room_ic_remove_member_select_gray);
        }
    }

    public final boolean getConvening() {
        return this.convening;
    }

    public final void setConvening(boolean z) {
        this.convening = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomMemberConveneSelectItemView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        zg zgVarInflate = zg.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(zgVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25118Oooo0o = zgVarInflate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomMemberConveneSelectItemView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        zg zgVarInflate = zg.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(zgVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25118Oooo0o = zgVarInflate;
    }
}

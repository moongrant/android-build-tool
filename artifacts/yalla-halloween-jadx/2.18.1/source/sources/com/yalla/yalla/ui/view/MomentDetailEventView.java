package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.model.EventState;
import com.yalla.yalla.model.MomentForwardContent;
import com.yalla.yalla.ui.screen.event.EventDetailScreen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p496o0o00OOo.o000oOoO;
import p522o0o0O0o.oo0o0O0;
import p584o0oOoo.o000O;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.hd;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R?\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailEventView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "id", "", "Oooo0oo", "Lkotlin/jvm/functions/Function1;", "getEventClickListener", "()Lkotlin/jvm/functions/Function1;", "setEventClickListener", "(Lkotlin/jvm/functions/Function1;)V", "eventClickListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class MomentDetailEventView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Drawable f24868Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final hd f24869Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public MomentForwardContent f24870Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Long, Unit> eventClickListener;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final OooO00o f24872OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final Drawable f24873OoooO00;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MomentForwardContent momentForwardContent = MomentDetailEventView.this.f24870Oooo0oO;
            if (momentForwardContent != null) {
                long id = momentForwardContent.getId();
                MomentDetailEventView momentDetailEventView = MomentDetailEventView.this;
                if (id > 0) {
                    if (momentDetailEventView.getEventClickListener() == null) {
                        EventModel model = new EventModel();
                        model.setId(id);
                        Intrinsics.checkNotNullParameter(model, "model");
                        Bundle bundleOooO00o = o000O00O.OooO0OO.OooO00o();
                        bundleOooO00o.putSerializable("key", model);
                        o000O.OooO00o(EventDetailScreen.f24568OooO00o, bundleOooO00o);
                    }
                    Function1<Long, Unit> eventClickListener = momentDetailEventView.getEventClickListener();
                    if (eventClickListener != null) {
                        eventClickListener.invoke(Long.valueOf(id));
                    }
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailEventView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean OooO0O0(@Nullable MomentForwardContent momentForwardContent) {
        this.f24870Oooo0oO = momentForwardContent;
        if (momentForwardContent == null) {
            oOO00O.OooO00o(this);
            return false;
        }
        oOO00O.OooO(this);
        if (!TextUtils.isEmpty(momentForwardContent.getImage())) {
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o());
            oooO00o.OooO0oo(8, 8, 0, 0);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(momentForwardContent.getImage());
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO0o(this.f24869Oooo0o.f49556OooO0OO);
        }
        if (momentForwardContent.getEventState() == EventState.INSTANCE.getInProgress()) {
            TextView textView = this.f24869Oooo0o.f49560OooO0oO;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.eventTime");
            oo0o0O0.OooO0oo(textView, this.f24873OoooO00);
            this.f24869Oooo0o.f49560OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.color_FFA21F));
            this.f24869Oooo0o.f49560OooO0oO.setText(o000O0O0.OooO0OO(R.string.Event_Live_Now));
        } else {
            long startTime = momentForwardContent.getStartTime();
            if (o000oOoO.OooO00o(startTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                startTime *= (long) 1000;
            }
            if (startTime > 0) {
                TextView textView2 = this.f24869Oooo0o.f49560OooO0oO;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.eventTime");
                oo0o0O0.OooO0oo(textView2, this.f24868Oooo);
                this.f24869Oooo0o.f49560OooO0oO.setTextColor(o000O0O0.OooO00o(R.color.color_FFFFFFF));
                TextView textView3 = this.f24869Oooo0o.f49560OooO0oO;
                o00O0 o00o1 = o00O0.f48624OooO00o;
                long startTime2 = momentForwardContent.getStartTime();
                if (o000oOoO.OooO00o(startTime2, p279o0O00OoO.OooO.OooO00o()) == 3) {
                    startTime2 *= (long) 1000;
                }
                textView3.setText(o00o1.OooO0oO(startTime2));
            }
        }
        if (!TextUtils.isEmpty(momentForwardContent.getName())) {
            this.f24869Oooo0o.f49557OooO0Oo.setText(momentForwardContent.getName());
        }
        if (!TextUtils.isEmpty(momentForwardContent.getRoomName())) {
            this.f24869Oooo0o.f49558OooO0o.setText(momentForwardContent.getRoomName());
        }
        if (momentForwardContent.getRoomIdx() <= 0) {
            return true;
        }
        this.f24869Oooo0o.f49559OooO0o0.setText(String.valueOf(momentForwardContent.getRoomIdx()));
        return true;
    }

    @Nullable
    public final Function1<Long, Unit> getEventClickListener() {
        return this.eventClickListener;
    }

    public final void setEventClickListener(@Nullable Function1<? super Long, Unit> function1) {
        this.eventClickListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailEventView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailEventView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        hd hdVarInflate = hd.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(hdVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24869Oooo0o = hdVarInflate;
        this.f24868Oooo = OooOOO.OooO0O0(R.drawable.ic_event_time);
        this.f24873OoooO00 = OooOOO.OooO0O0(R.drawable.ic_event_time_progress);
        OooO00o oooO00o = new OooO00o();
        this.f24872OoooO0 = oooO00o;
        hdVarInflate.f49555OooO0O0.setOnClickListener(oooO00o);
    }
}

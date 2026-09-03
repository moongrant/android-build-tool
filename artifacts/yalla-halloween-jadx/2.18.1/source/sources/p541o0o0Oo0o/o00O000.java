package p541o0o0Oo0o;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0OoOo0;
import androidx.recyclerview.widget.o0OoOo0.OooO;
import com.app.base.framework.view.recyclerView.NoScrollRecyclerView;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O00.Oooo0;
import p193o00o0O00.o000oOoO;
import p206o00o0o0o.o000Oo0;
import p391o0OOooOo.o0O00000;
import p515o0o0O00.o00O00;
import p522o0o0O0o.o00O0;
import p570o0oOo0Oo.o000O0;
import p617o0oo0o.o00O0000;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f44145OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NoScrollRecyclerView f44146OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ImageView f44147OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f44148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f44149OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Boolean, Unit> f44150OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public o00O0000<String> f44151OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public String f44152OooO0oo;

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o00O00.OooO0O0("拖拽_侧滑 movementIndexListener = " + iIntValue);
            Function1<? super Integer, Unit> function1 = o00O000.this.f44149OooO0o;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(iIntValue));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00O000.this.f44147OooO0OO.setEnabled(false);
            o00O000.this.OooO0O0();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O000.this.OooO0O0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O000.this.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o00O00o0 f44157Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00O000 f44158Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o00O00o0 o00o00o1, o00O000 o00o001) {
            super(1);
            this.f44157Oooo0o = o00o00o1;
            this.f44158Oooo0oO = o00o001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o0O00000.OooO0OO("Moments_post_pic_delete");
            this.f44157Oooo0o.getData().remove(iIntValue);
            this.f44157Oooo0o.notifyItemRemoved(iIntValue);
            o00O00o0 o00o00o1 = this.f44157Oooo0o;
            o00O000 o00o001 = this.f44158Oooo0oO;
            List<String> data = o00o00o1.getData();
            Intrinsics.checkNotNullExpressionValue(data, "this.data");
            o00o00o1.setNewData(o00o001.OooO00o(data));
            Function0<Unit> function0 = this.f44157Oooo0o.f44169OooO0OO;
            if (function0 != null) {
                function0.invoke();
            }
            this.f44157Oooo0o.f44167OooO00o.Oooo0OO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {
        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O000.this.f44147OooO0OO.setEnabled(true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                o00O000 o00o001 = o00O000.this;
                Objects.requireNonNull(o00o001);
                SelectImageData selectImageData = new SelectImageData();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> it = o00o001.f44148OooO0Oo.getData().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String item = it.next();
                    if (o00O0.OooO0o0(item)) {
                        Uri uriOooO0OO = o000Oo0.OooO0OO(o00o001.f44145OooO00o, item);
                        if (uriOooO0OO == null) {
                            uriOooO0OO = Uri.parse(String.valueOf(System.currentTimeMillis()));
                        }
                        selectImageData.OooO00o().add(uriOooO0OO);
                        if (o00O0.OooO0Oo(item)) {
                            arrayList2.add(uriOooO0OO);
                            Intrinsics.checkNotNullExpressionValue(item, "item");
                            arrayList.add(item);
                        }
                    }
                }
                Oooo0 oooo0 = Oooo0.f33130OooO00o;
                MomentSendActivity activity = o00o001.f44145OooO00o;
                o00O000o o00o000o2 = new o00O000o(arrayList, o00o001, arrayList2);
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(selectImageData, "<set-?>");
                Intrinsics.checkNotNullParameter(activity, "activity");
                o000oOoO o000oooo2 = new o000oOoO(activity);
                o000oooo2.f33135OooO0O0 = 9;
                o000oooo2.f33136OooO0OO = true;
                o000oooo2.f33137OooO0Oo = false;
                o000oooo2.f33133OooO = false;
                o000oooo2.f33139OooO0o0 = 1.0f;
                o000oooo2.f33138OooO0o = 1.0f;
                o000oooo2.f33140OooO0oO = true;
                o000oooo2.f33141OooO0oo = false;
                o000oooo2.f33142OooOO0 = selectImageData;
                oooo0.OooO00o(o000oooo2, o00o000o2);
                o00O000.this.f44147OooO0OO.setEnabled(true);
            } else {
                o00O000.this.f44147OooO0OO.setEnabled(true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    public o00O000(@NotNull MomentSendActivity activity, @NotNull NoScrollRecyclerView recyclerView, @NotNull ImageView mIvAddImage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(mIvAddImage, "mIvAddImage");
        this.f44145OooO00o = activity;
        this.f44146OooO0O0 = recyclerView;
        this.f44147OooO0OO = mIvAddImage;
        o00O00o0 o00o00o1 = new o00O00o0(activity, new ArrayList());
        o00o00o1.f44168OooO0O0 = new OooO0O0();
        o00o00o1.f44169OooO0OO = new OooO0OO();
        o00o00o1.f44170OooO0Oo = new OooO0o(o00o00o1, this);
        this.f44148OooO0Oo = o00o00o1;
        o00O0000<String> o00o0001 = new o00O0000<>(o00o00o1);
        o00o0001.f48553OooO0o = new OooO();
        o00o0001.OooOO0O(0);
        o0OoOo0 o0oooo1 = new o0OoOo0(o00o0001);
        RecyclerView recyclerView2 = o0oooo1.f9223OooOOo;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(o0oooo1);
                o0oooo1.f9223OooOOo.removeOnItemTouchListener(o0oooo1.f9233OooOoOO);
                o0oooo1.f9223OooOOo.removeOnChildAttachStateChangeListener(o0oooo1);
                for (int size = o0oooo1.f9222OooOOOo.size() - 1; size >= 0; size--) {
                    o0OoOo0.OooOO0 oooOO1 = (o0OoOo0.OooOO0) o0oooo1.f9222OooOOOo.get(0);
                    oooOO1.f9253OoooO0O.cancel();
                    o0oooo1.f9220OooOOO0.OooO00o(oooOO1.f9252OoooO00);
                }
                o0oooo1.f9222OooOOOo.clear();
                o0oooo1.f9230OooOo0o = null;
                o0oooo1.f9226OooOo = -1;
                VelocityTracker velocityTracker = o0oooo1.f9228OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0oooo1.f9228OooOo00 = null;
                }
                o0OoOo0.OooO oooO = o0oooo1.f9231OooOoO;
                if (oooO != null) {
                    oooO.f9236OooO00o = false;
                    o0oooo1.f9231OooOoO = null;
                }
                if (o0oooo1.f9232OooOoO0 != null) {
                    o0oooo1.f9232OooOoO0 = null;
                }
            }
            o0oooo1.f9223OooOOo = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                o0oooo1.f9212OooO0o = resources.getDimension(p090o000o00O.o000oOoO.item_touch_helper_swipe_escape_velocity);
                o0oooo1.f9214OooO0oO = resources.getDimension(p090o000o00O.o000oOoO.item_touch_helper_swipe_escape_max_velocity);
                o0oooo1.f9224OooOOo0 = ViewConfiguration.get(o0oooo1.f9223OooOOo.getContext()).getScaledTouchSlop();
                o0oooo1.f9223OooOOo.addItemDecoration(o0oooo1);
                o0oooo1.f9223OooOOo.addOnItemTouchListener(o0oooo1.f9233OooOoOO);
                o0oooo1.f9223OooOOo.addOnChildAttachStateChangeListener(o0oooo1);
                o0oooo1.f9231OooOoO = o0oooo1.new OooO();
                o0oooo1.f9232OooOoO0 = new o000O0O0.OooO0OO(o0oooo1.f9223OooOOo.getContext(), o0oooo1.f9231OooOoO);
            }
        }
        this.f44151OooO0oO = o00o0001;
        this.f44146OooO0O0.setLayoutManager(new GridLayoutManager((Context) this.f44145OooO00o, 3, 1, false));
        this.f44146OooO0O0.addItemDecoration(new o000O0(OooOo00.OooO00o(1.0f)));
        this.f44147OooO0OO.setOnClickListener(new OooO00o());
        this.f44148OooO0Oo.hindEmptyView(true);
        this.f44146OooO0O0.setAdapter(this.f44148OooO0Oo);
        OooO0OO();
        this.f44152OooO0oo = "";
    }

    public final List<String> OooO00o(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() < 9) {
            arrayList.add(this.f44152OooO0oo);
        }
        return arrayList;
    }

    public final void OooO0O0() {
        this.f44145OooO00o.OooOooO().f48991OooO0oo.OooO0O0();
        o0O00000.OooO0OO("Moemnts_post_pic");
        o0O0O00.OooO0OO(this.f44145OooO00o, oo0o0Oo.f48607OooO0O0, new OooOO0(), new OooOO0O());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.Boolean>] */
    public final void OooO0OO() {
        o00O00o0 o00o00o1 = this.f44148OooO0Oo;
        List<String> data = o00o00o1.getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        o00o00o1.setNewData(OooO00o(data));
        this.f44151OooO0oO.f48554OooO0o0.clear();
        int size = this.f44148OooO0Oo.getData().size() - 1;
        if (size >= 0 && TextUtils.isEmpty(this.f44148OooO0Oo.getData().get(size))) {
            this.f44151OooO0oO.OooOO0O(size);
        }
        this.f44148OooO0Oo.setLoadComplete();
        if (this.f44148OooO0Oo.getData().size() == 1) {
            Function1<? super Boolean, Unit> function1 = this.f44150OooO0o0;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
            this.f44147OooO0OO.setVisibility(0);
            this.f44146OooO0O0.setVisibility(8);
            return;
        }
        Function1<? super Boolean, Unit> function2 = this.f44150OooO0o0;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE);
        }
        this.f44147OooO0OO.setVisibility(8);
        this.f44146OooO0O0.setVisibility(0);
    }
}

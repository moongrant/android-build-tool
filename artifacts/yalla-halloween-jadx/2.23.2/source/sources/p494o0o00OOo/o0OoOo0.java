package p494o0o00OOo;

import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.Oooo0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00O0O;
import androidx.recyclerview.widget.o00O0O.OooO;
import com.code.android.util.o0000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p108o000ooOO.o0O0ooO;
import p491o0o00O0o.o0O0O0O;
import p513o0o0O00.o0OOO0o;
import p590o0oOooo0.m0;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1855#2,2:355\n1855#2,2:357\n*S KotlinDebug\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage\n*L\n124#1:355,2\n132#1:357,2\n*E\n"})
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f49590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NoScrollRecyclerView f49591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MomentSendImageAdapter f49592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f49593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final m0<MomentSelectMedia> f49594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f49595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f49596OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f49597OooO0oo;

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o0000O00.OooO0O0("拖拽_侧滑 movementIndexListener = " + iIntValue);
            Function1<? super Integer, Unit> function1 = o0OoOo0.this.f49595OooO0o0;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(iIntValue));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function3<Integer, Integer, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f49599OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OoOo0 f49600OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<MomentSelectMedia> f49601OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, ArrayList arrayList, o0OoOo0 o0oooo1) {
            super(3);
            this.f49599OooO0Oo = str;
            this.f49601OooO0o0 = arrayList;
            this.f49600OooO0o = o0oooo1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Integer num, Integer num2, Long l) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            long jLongValue = l.longValue();
            MomentSelectMedia momentSelectMedia = new MomentSelectMedia(this.f49599OooO0Oo);
            momentSelectMedia.setWidth(iIntValue);
            momentSelectMedia.setHeight(iIntValue2);
            momentSelectMedia.setDuration(jLongValue);
            List<MomentSelectMedia> list = this.f49601OooO0o0;
            list.add(momentSelectMedia);
            o0OoOo0 o0oooo1 = this.f49600OooO0o;
            if (jLongValue > 0) {
                o0oooo1.f49592OooO0OO.OooOoO0(o0oooo1.OooO00o(list));
            } else {
                o0oooo1.f49592OooO0OO.OooO0OO(momentSelectMedia);
            }
            o0oooo1.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OoOo0 o0oooo1 = o0OoOo0.this;
            MomentSendActivity momentSendActivity = o0oooo1.f49590OooO00o;
            momentSendActivity.OooOo().f44320OooO0o.OooO0o0();
            o0oo0000.OooO00o.OooO0O0("203007");
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(momentSendActivity, PermissionGroupReveal.f32340OooO0o0, o00O0O.f49578OooO0Oo, new o00Oo0(o0oooo1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OoOo0.this.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentSendImageAdapter f49604OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OoOo0 f49605OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentSendImageAdapter momentSendImageAdapter, o0OoOo0 o0oooo1) {
            super(1);
            this.f49604OooO0Oo = momentSendImageAdapter;
            this.f49605OooO0o0 = o0oooo1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o0oo0000.OooO00o.OooO0O0("103017");
            MomentSendImageAdapter momentSendImageAdapter = this.f49604OooO0Oo;
            momentSendImageAdapter.f13189OooOOoo.remove(iIntValue);
            momentSendImageAdapter.notifyItemRemoved(iIntValue);
            momentSendImageAdapter.OooOoO0(this.f49605OooO0o0.OooO00o(momentSendImageAdapter.f13189OooOOoo));
            Function0<Unit> function0 = momentSendImageAdapter.f25973OooOooO;
            if (function0 != null) {
                function0.invoke();
            }
            momentSendImageAdapter.f25972OooOoo0.OooOooo();
            return Unit.INSTANCE;
        }
    }

    public o0OoOo0(@NotNull MomentSendActivity activity, @NotNull NoScrollRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f49590OooO00o = activity;
        this.f49591OooO0O0 = recyclerView;
        MomentSendImageAdapter momentSendImageAdapter = new MomentSendImageAdapter(activity, new ArrayList());
        momentSendImageAdapter.f25971OooOoo = new OooO0O0();
        momentSendImageAdapter.f25973OooOooO = new OooO0OO();
        momentSendImageAdapter.f25974OooOooo = new OooO0o(momentSendImageAdapter, this);
        this.f49592OooO0OO = momentSendImageAdapter;
        m0<MomentSelectMedia> m0Var = new m0<>(momentSendImageAdapter);
        m0Var.f57150OooO0o0 = new OooO();
        LinkedHashMap linkedHashMap = m0Var.f57148OooO0Oo;
        linkedHashMap.clear();
        linkedHashMap.put(0, Boolean.TRUE);
        o00O0O o00o0o2 = new o00O0O(m0Var);
        RecyclerView recyclerView2 = o00o0o2.f10897OooOOo;
        if (recyclerView2 != recyclerView) {
            o00O0O.OooO0O0 oooO0O0 = o00o0o2.f10905OooOoO;
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(o00o0o2);
                o00o0o2.f10897OooOOo.removeOnItemTouchListener(oooO0O0);
                o00o0o2.f10897OooOOo.removeOnChildAttachStateChangeListener(o00o0o2);
                ArrayList arrayList = o00o0o2.f10896OooOOOo;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    o00O0O.OooOO0 oooOO1 = (o00O0O.OooOO0) arrayList.get(0);
                    oooOO1.f10924OooOO0.cancel();
                    o00o0o2.f10894OooOOO0.getClass();
                    o00O0O.OooO0o.OooO00o(oooOO1.f10923OooO0oo);
                }
                arrayList.clear();
                o00o0o2.f10904OooOo0o = null;
                VelocityTracker velocityTracker = o00o0o2.f10902OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o00o0o2.f10902OooOo00 = null;
                }
                o00O0O.OooO oooO = o00o0o2.f10906OooOoO0;
                if (oooO != null) {
                    oooO.f10909OooO0Oo = false;
                    o00o0o2.f10906OooOoO0 = null;
                }
                if (o00o0o2.f10900OooOo != null) {
                    o00o0o2.f10900OooOo = null;
                }
            }
            o00o0o2.f10897OooOOo = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                o00o0o2.f10886OooO0o = resources.getDimension(o0O0ooO.item_touch_helper_swipe_escape_velocity);
                o00o0o2.f10888OooO0oO = resources.getDimension(o0O0ooO.item_touch_helper_swipe_escape_max_velocity);
                o00o0o2.f10898OooOOo0 = ViewConfiguration.get(o00o0o2.f10897OooOOo.getContext()).getScaledTouchSlop();
                o00o0o2.f10897OooOOo.addItemDecoration(o00o0o2);
                o00o0o2.f10897OooOOo.addOnItemTouchListener(oooO0O0);
                o00o0o2.f10897OooOOo.addOnChildAttachStateChangeListener(o00o0o2);
                o00o0o2.f10906OooOoO0 = o00o0o2.new OooO();
                o00o0o2.f10900OooOo = new Oooo0(o00o0o2.f10897OooOOo.getContext(), o00o0o2.f10906OooOoO0);
            }
        }
        this.f49594OooO0o = m0Var;
        this.f49591OooO0O0.setLayoutManager(new GridLayoutManager(3, this.f49590OooO00o));
        this.f49591OooO0O0.addItemDecoration(new o0OOO0o(o0000O0.OooO00o(1)));
        this.f49592OooO0OO.OooOoOO(true);
        this.f49591OooO0O0.setAdapter(this.f49592OooO0OO);
        OooO0Oo();
        LiveEventBus.get("MOMENT_SEND_EDIT_VIDEO_URI", Uri.class).observe(this.f49590OooO00o, new o0O0O0O(this, 1));
    }

    public final ArrayList OooO00o(List list) {
        ArrayList arrayList = new ArrayList();
        this.f49596OooO0oO = 0;
        this.f49597OooO0oo = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MomentSelectMedia momentSelectMedia = (MomentSelectMedia) it.next();
                if (momentSelectMedia.getDuration() > 0) {
                    this.f49596OooO0oO++;
                }
                if (momentSelectMedia.getPath().length() > 0) {
                    this.f49597OooO0oo++;
                    arrayList.add(momentSelectMedia);
                }
            }
        }
        if (this.f49596OooO0oO == 0 && this.f49597OooO0oo < 9) {
            int type = this.f49590OooO00o.OooOoOO().getType();
            if ((type == MomentType.Text.getValue() || type == MomentType.Image.getValue()) || type == MomentType.Video.getValue()) {
                arrayList.add(new MomentSelectMedia(""));
            }
        }
        return arrayList;
    }

    public final boolean OooO0O0() {
        MomentSendImageAdapter momentSendImageAdapter = this.f49592OooO0OO;
        OooO00o(momentSendImageAdapter.f13189OooOOoo);
        return this.f49596OooO0oO > 0 || momentSendImageAdapter.f13189OooOOoo.size() > 1;
    }

    public final void OooO0OO(@NotNull List<MomentSelectMedia> listData) {
        Intrinsics.checkNotNullParameter(listData, "listData");
        this.f49592OooO0OO.OooOoO0(OooO00o(listData));
        OooO0Oo();
    }

    public final void OooO0Oo() {
        MomentSendImageAdapter momentSendImageAdapter = this.f49592OooO0OO;
        momentSendImageAdapter.OooOoO0(OooO00o(momentSendImageAdapter.f13189OooOOoo));
        m0<MomentSelectMedia> m0Var = this.f49594OooO0o;
        m0Var.f57148OooO0Oo.clear();
        int size = momentSendImageAdapter.f13189OooOOoo.size() - 1;
        if (size >= 0 && TextUtils.isEmpty(((MomentSelectMedia) momentSendImageAdapter.f13189OooOOoo.get(size)).getPath())) {
            LinkedHashMap linkedHashMap = m0Var.f57148OooO0Oo;
            linkedHashMap.clear();
            linkedHashMap.put(Integer.valueOf(size), Boolean.TRUE);
        }
        momentSendImageAdapter.Oooo00o();
        Function0<Unit> function0 = this.f49593OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
        this.f49591OooO0O0.setVisibility(0);
    }
}

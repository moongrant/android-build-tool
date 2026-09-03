package p488o0o00O0o;

import android.app.Activity;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.Oooo0;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0OoOo0;
import androidx.recyclerview.widget.o0OoOo0.OooO;
import com.code.android.util.Oooo000;
import com.code.android.util.o0000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.album.AlbumActivity;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.activity.moment.momentSend.MomentSendImageAdapter;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p504o0o00oo.o00000O;
import p579o0oOoo.oOO0Oo00;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n1855#2,2:355\n1855#2,2:357\n*S KotlinDebug\n*F\n+ 1 MomentSendImage.kt\ncom/yalla/yalla/ui/activity/moment/momentSend/MomentSendImage\n*L\n124#1:355,2\n132#1:357,2\n*E\n"})
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MomentSendActivity f48448OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final NoScrollRecyclerView f48449OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MomentSendImageAdapter f48450OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f48451OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final oOO0Oo00<MomentSelectMedia> f48452OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function1<? super Integer, Unit> f48453OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f48454OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f48455OooO0oo;

    public static final class OooO extends Lambda implements Function1<Integer, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            OooOOO0.OooO0O0("拖拽_侧滑 movementIndexListener = " + iIntValue);
            Function1<? super Integer, Unit> function1 = o0OO00O.this.f48453OooO0o0;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(iIntValue));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Uri> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Uri uri) {
            Uri it = uri;
            Activity activityOooO00o = com.code.android.util.OooO0O0.OooO00o(AlbumActivity.class);
            if (activityOooO00o != null) {
                activityOooO00o.finish();
            }
            ArrayList arrayList = new ArrayList();
            o0OO00O o0oo00o2 = o0OO00O.this;
            MomentSendActivity momentSendActivity = o0oo00o2.f48448OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            File fileOooO0O0 = Oooo000.OooO0O0(momentSendActivity, it);
            String absolutePath = fileOooO0O0 != null ? fileOooO0O0.getAbsolutePath() : null;
            if (absolutePath == null) {
                absolutePath = "";
            }
            p139o00OOooO.OooO.OooO0o0(absolutePath, new o0Oo0oo(absolutePath, arrayList, o0oo00o2));
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO00O o0oo00o2 = o0OO00O.this;
            MomentSendActivity momentSendActivity = o0oo00o2.f48448OooO00o;
            momentSendActivity.OooOo().f58558OooO0o.OooO0o0();
            o0OO000.OooO00o("203007");
            com.yalla.yalla.util.permission.OooO00o.OooO0OO(momentSendActivity, PermissionGroupReveal.f32884OooO0o0, oo0o0Oo.f48469OooO0Oo, new o0O0O00(o0oo00o2));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO00O.this.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentSendImageAdapter f48460OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f48461OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(MomentSendImageAdapter momentSendImageAdapter, o0OO00O o0oo00o2) {
            super(1);
            this.f48460OooO0Oo = momentSendImageAdapter;
            this.f48461OooO0o0 = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            int iIntValue = num.intValue();
            o0OO000.OooO00o("103017");
            MomentSendImageAdapter momentSendImageAdapter = this.f48460OooO0Oo;
            momentSendImageAdapter.f10111OooOOoo.remove(iIntValue);
            momentSendImageAdapter.notifyItemRemoved(iIntValue);
            momentSendImageAdapter.OooOoO0(this.f48461OooO0o0.OooO00o(momentSendImageAdapter.f10111OooOOoo));
            Function0<Unit> function0 = momentSendImageAdapter.f26425OooOooO;
            if (function0 != null) {
                function0.invoke();
            }
            momentSendImageAdapter.f26424OooOoo0.OooOooo();
            return Unit.INSTANCE;
        }
    }

    public o0OO00O(@NotNull MomentSendActivity activity, @NotNull NoScrollRecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f48448OooO00o = activity;
        this.f48449OooO0O0 = recyclerView;
        MomentSendImageAdapter momentSendImageAdapter = new MomentSendImageAdapter(activity, new ArrayList());
        momentSendImageAdapter.f26423OooOoo = new OooO0O0();
        momentSendImageAdapter.f26425OooOooO = new OooO0OO();
        momentSendImageAdapter.f26426OooOooo = new OooO0o(momentSendImageAdapter, this);
        this.f48450OooO0OO = momentSendImageAdapter;
        oOO0Oo00<MomentSelectMedia> ooo0oo00 = new oOO0Oo00<>(momentSendImageAdapter);
        ooo0oo00.f56667OooO0o0 = new OooO();
        LinkedHashMap linkedHashMap = ooo0oo00.f56665OooO0Oo;
        linkedHashMap.clear();
        linkedHashMap.put(0, Boolean.TRUE);
        o0OoOo0 o0oooo0 = new o0OoOo0(ooo0oo00);
        RecyclerView recyclerView2 = o0oooo0.f7840OooOOo;
        if (recyclerView2 != recyclerView) {
            o0OoOo0.OooO0O0 oooO0O0 = o0oooo0.f7848OooOoO;
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(o0oooo0);
                o0oooo0.f7840OooOOo.removeOnItemTouchListener(oooO0O0);
                o0oooo0.f7840OooOOo.removeOnChildAttachStateChangeListener(o0oooo0);
                ArrayList arrayList = o0oooo0.f7839OooOOOo;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    o0OoOo0.OooOO0 oooOO1 = (o0OoOo0.OooOO0) arrayList.get(0);
                    oooOO1.f7867OooOO0.cancel();
                    o0oooo0.f7837OooOOO0.getClass();
                    o0OoOo0.OooO0o.OooO00o(oooOO1.f7866OooO0oo);
                }
                arrayList.clear();
                o0oooo0.f7847OooOo0o = null;
                VelocityTracker velocityTracker = o0oooo0.f7845OooOo00;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    o0oooo0.f7845OooOo00 = null;
                }
                o0OoOo0.OooO oooO = o0oooo0.f7849OooOoO0;
                if (oooO != null) {
                    oooO.f7852OooO0Oo = false;
                    o0oooo0.f7849OooOoO0 = null;
                }
                if (o0oooo0.f7843OooOo != null) {
                    o0oooo0.f7843OooOo = null;
                }
            }
            o0oooo0.f7840OooOOo = recyclerView;
            if (recyclerView != null) {
                Resources resources = recyclerView.getResources();
                o0oooo0.f7829OooO0o = resources.getDimension(o000OO0O.OooO0O0.item_touch_helper_swipe_escape_velocity);
                o0oooo0.f7831OooO0oO = resources.getDimension(o000OO0O.OooO0O0.item_touch_helper_swipe_escape_max_velocity);
                o0oooo0.f7841OooOOo0 = ViewConfiguration.get(o0oooo0.f7840OooOOo.getContext()).getScaledTouchSlop();
                o0oooo0.f7840OooOOo.addItemDecoration(o0oooo0);
                o0oooo0.f7840OooOOo.addOnItemTouchListener(oooO0O0);
                o0oooo0.f7840OooOOo.addOnChildAttachStateChangeListener(o0oooo0);
                o0oooo0.f7849OooOoO0 = o0oooo0.new OooO();
                o0oooo0.f7843OooOo = new Oooo0(o0oooo0.f7840OooOOo.getContext(), o0oooo0.f7849OooOoO0);
            }
        }
        this.f48452OooO0o = ooo0oo00;
        this.f48449OooO0O0.setLayoutManager(new GridLayoutManager(3, this.f48448OooO00o));
        this.f48449OooO0O0.addItemDecoration(new o00000O(o0000O0.OooO00o(1)));
        this.f48450OooO0OO.OooOoOO(true);
        this.f48449OooO0O0.setAdapter(this.f48450OooO0OO);
        OooO0Oo();
        LiveEventBus.get("MOMENT_SEND_EDIT_VIDEO_URI", Uri.class).observe(this.f48448OooO00o, new OooO00o());
    }

    public final ArrayList OooO00o(List list) {
        ArrayList arrayList = new ArrayList();
        this.f48454OooO0oO = 0;
        this.f48455OooO0oo = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MomentSelectMedia momentSelectMedia = (MomentSelectMedia) it.next();
                if (momentSelectMedia.getDuration() > 0) {
                    this.f48454OooO0oO++;
                }
                if (momentSelectMedia.getPath().length() > 0) {
                    this.f48455OooO0oo++;
                    arrayList.add(momentSelectMedia);
                }
            }
        }
        if (this.f48454OooO0oO == 0 && this.f48455OooO0oo < 9) {
            int type = this.f48448OooO00o.OooOoOO().getType();
            if ((type == MomentType.Text.getValue() || type == MomentType.Image.getValue()) || type == MomentType.Video.getValue()) {
                arrayList.add(new MomentSelectMedia(""));
            }
        }
        return arrayList;
    }

    public final boolean OooO0O0() {
        MomentSendImageAdapter momentSendImageAdapter = this.f48450OooO0OO;
        OooO00o(momentSendImageAdapter.f10111OooOOoo);
        return this.f48454OooO0oO > 0 || momentSendImageAdapter.f10111OooOOoo.size() > 1;
    }

    public final void OooO0OO(@NotNull List<MomentSelectMedia> listData) {
        Intrinsics.checkNotNullParameter(listData, "listData");
        this.f48450OooO0OO.OooOoO0(OooO00o(listData));
        OooO0Oo();
    }

    public final void OooO0Oo() {
        MomentSendImageAdapter momentSendImageAdapter = this.f48450OooO0OO;
        momentSendImageAdapter.OooOoO0(OooO00o(momentSendImageAdapter.f10111OooOOoo));
        oOO0Oo00<MomentSelectMedia> ooo0oo00 = this.f48452OooO0o;
        ooo0oo00.f56665OooO0Oo.clear();
        int size = momentSendImageAdapter.f10111OooOOoo.size() - 1;
        if (size >= 0 && TextUtils.isEmpty(((MomentSelectMedia) momentSendImageAdapter.f10111OooOOoo.get(size)).getPath())) {
            LinkedHashMap linkedHashMap = ooo0oo00.f56665OooO0Oo;
            linkedHashMap.clear();
            linkedHashMap.put(Integer.valueOf(size), Boolean.TRUE);
        }
        momentSendImageAdapter.Oooo00o();
        Function0<Unit> function0 = this.f48451OooO0Oo;
        if (function0 != null) {
            function0.invoke();
        }
        this.f48449OooO0O0.setVisibility(0);
    }
}

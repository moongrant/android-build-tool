package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO0000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/ExploreTagRoomListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExploreTagRoomListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExploreTagRoomListActivity.kt\ncom/yalla/yalla/ui/activity/room/ExploreTagRoomListActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n22#2,2:184\n1#3:186\n*S KotlinDebug\n*F\n+ 1 ExploreTagRoomListActivity.kt\ncom/yalla/yalla/ui/activity/room/ExploreTagRoomListActivity\n*L\n38#1:184,2\n*E\n"})
public final class ExploreTagRoomListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26094OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f26096OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public p443o0OoOo0o.o000O0Oo f26101OooOoO;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26095OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(oO0000O.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ArrayList f26098OooOo00 = new ArrayList();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f26097OooOo0 = new ArrayList();

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f26099OooOo0O = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f26100OooOo0o = new ArrayList();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final OooO00o f26102OooOoO0 = new OooO00o();

    public static final class OooO00o extends FragmentStateAdapter {
        public OooO00o() {
            super(ExploreTagRoomListActivity.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public final Fragment createFragment(int i) {
            return (Fragment) ExploreTagRoomListActivity.this.f26099OooOo0O.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ExploreTagRoomListActivity.this.f26099OooOo0O.size();
        }
    }

    public final oO0000O OooOo() {
        return (oO0000O) this.f26095OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44740OooO00o);
        OooOOoo(p562o0oOo000.o000000.tag);
        OooOo().f44741OooO0O0.setOnClickListener(new o0000Ooo(this));
        OooOo().f44745OooO0o0.registerOnPageChangeCallback(new o0000(this));
        this.f26096OooOo = getIntent().getIntExtra("TAG_ID", 0);
        p443o0OoOo0o.o000O0Oo o000o0oo2 = new p443o0OoOo0o.o000O0Oo(this, 2);
        this.f26101OooOoO = o000o0oo2;
        LiveEventBus.get("EXPLORE_TAGS_DATA").observeStickyForever(o000o0oo2);
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p443o0OoOo0o.o000O0Oo o000o0oo2 = this.f26101OooOoO;
        if (o000o0oo2 != null) {
            LiveEventBus.get("EXPLORE_TAGS_DATA").removeObserver(o000o0oo2);
        }
    }
}

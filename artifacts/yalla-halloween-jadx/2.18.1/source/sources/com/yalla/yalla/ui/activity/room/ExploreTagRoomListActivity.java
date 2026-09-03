package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.app.base.model.CategoryModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o0OOO0o;
import p254o00ooO0O.o00O000o;
import p544o0o0OoOO.a4;
import p544o0o0OoOO.b4;
import p649o0ooOOoo.ga;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/ExploreTagRoomListActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ExploreTagRoomListActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22818Ooooooo = new OooO00o();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f22824OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public Observer<Object> f22825Oooooo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f22827OoooooO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f22819OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ga.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final List<CategoryModel> f22820Ooooo00 = new ArrayList();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final List<String> f22821Ooooo0o = new ArrayList();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final List<Fragment> f22822OooooO0 = new ArrayList();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public List<View> f22823OooooOO = new ArrayList();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f22826Oooooo0 = new OooO0O0();

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends FragmentStateAdapter {
        public OooO0O0() {
            super(ExploreTagRoomListActivity.this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NotNull
        public final Fragment createFragment(int i) {
            return (Fragment) ExploreTagRoomListActivity.this.f22822OooooO0.get(i);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ExploreTagRoomListActivity.this.f22822OooooO0.size();
        }
    }

    public final ga OooOoo() {
        return (ga) this.f22819OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49441OooO00o);
        OooOo(R.string.tag);
        OooOoo().f49442OooO0O0.setOnClickListener(new a4(this));
        OooOoo().f49446OooO0o0.registerOnPageChangeCallback(new b4(this));
        this.f22824OooooOo = getIntent().getIntExtra("TAG_ID", 0);
        o0OOO0o o0ooo0o2 = new o0OOO0o(this, 6);
        this.f22825Oooooo = o0ooo0o2;
        LiveEventBus.get("EXPLORE_TAGS_DATA").observeStickyForever(o0ooo0o2);
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Observer<Object> observer = this.f22825Oooooo;
        if (observer != null) {
            LiveEventBus.get("EXPLORE_TAGS_DATA").removeObserver(observer);
        }
    }
}

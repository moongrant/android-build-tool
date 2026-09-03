package com.yalla.album;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.app.selectPicture.model.SelectImageData;
import com.common.support.imagepicker.album.YLAlbum;
import com.common.support.imagepicker.album.config.Album;
import com.common.support.imagepicker.album.config.AlbumMultiMode;
import com.common.support.imagepicker.album.entities.AlbumConfig;
import com.common.support.imagepicker.base.ImagePicker;
import com.common.support.imagepicker.dataprovider.config.AlbumQueryMode;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.dataprovider.entities.AlbumSource;
import com.facebook.login.OooOO0O;
import com.facebook.login.OooOOO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o0OO0.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200o00o0o.o00O0000;
import p358o0OOOooO.o000000;
import p358o0OOOooO.o000000O;
import p358o0OOOooO.o00000OO;
import p358o0OOOooO.o000O0o;
import p358o0OOOooO.o000OOo;
import p358o0OOOooO.o0OO00O;
import p358o0OOOooO.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/album/AlbumActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LibSelectPicture_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,370:1\n262#2,2:371\n262#2,2:395\n260#2:401\n1194#3,2:373\n1222#3,4:375\n766#3:379\n857#3,2:380\n1603#3,9:382\n1855#3:391\n1856#3:393\n1612#3:394\n1#4:392\n125#5:397\n152#5,3:398\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity\n*L\n130#1:371,2\n231#1:395,2\n126#1:401\n182#1:373,2\n182#1:375,4\n183#1:379\n183#1:380,2\n183#1:382,9\n183#1:391\n183#1:393\n183#1:394\n183#1:392\n365#1:397\n365#1:398,3\n*E\n"})
public final class AlbumActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f22491OooOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f22492OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00000OO f22493OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public p118o00O0Oo0.OooO0O0 f22494OooO0o0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Album f22497OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f22499OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f22501OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f22503OooOOOo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<AlbumSource> f22495OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public ArrayList<Uri> f22496OooO0oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f22498OooOO0O = 1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f22500OooOOO = 1.0f;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f22502OooOOOO = 1.0f;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22505OooOOo0 = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22504OooOOo = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f22506OooOOoo = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f22507OooOo00 = LazyKt.lazy(OooO0OO.f22510OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<LinearLayout> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return (LinearLayout) AlbumActivity.this.findViewById(o0OO0.OooO0OO.activity_all_images_listView_layout);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<RecyclerView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return (RecyclerView) AlbumActivity.this.findViewById(o0OO0.OooO0OO.activity_all_images_listView);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o000O0o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f22510OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000O0o invoke() {
            return new o000O0o();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<RecyclerView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return (RecyclerView) AlbumActivity.this.findViewById(o0OO0.OooO0OO.activity_all_images_recyclerView);
        }
    }

    public static final void OooOOO0(AlbumActivity activity, int i) {
        int i2 = activity.f22498OooOO0O;
        Intrinsics.checkNotNullParameter(activity, "activity");
        BigImageSelectActivity.f22515OooOOOO = new WeakReference<>(activity);
        Bundle bundle = new Bundle();
        bundle.putInt("MaxCount", i2);
        bundle.putInt("File_Index", i);
        Intent intent = new Intent(activity, (Class<?>) BigImageSelectActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @NotNull
    public final Album OooOOO() {
        Album album = this.f22497OooOO0;
        if (album != null) {
            return album;
        }
        Intrinsics.throwUninitializedPropertyAccessException("album");
        return null;
    }

    @NotNull
    public final RecyclerView OooOOOO() {
        Object value = this.f22505OooOOo0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    public final void OooOOOo() {
        LinkedHashMap<Long, AlbumItemWrapper> multiSelectedData = OooOOO().getMultiSelectedData();
        ArrayList arrayList = new ArrayList(multiSelectedData.size());
        Iterator<Map.Entry<Long, AlbumItemWrapper>> it = multiSelectedData.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().getOriginItem().getContentUri());
        }
        SelectImageData selectImageData = new SelectImageData();
        selectImageData.f9785OooO0Oo = new ArrayList<>(arrayList);
        Function1<? super SelectImageData, Unit> function1 = o00O0OO.OooO0o.f36540OooO00o;
        if (function1 != null) {
            function1.invoke(selectImageData);
        }
        o00O0OO.OooO0o.f36540OooO00o = null;
        finish();
    }

    public final void OooOOo() {
        p118o00O0Oo0.OooO0O0 oooO0O0 = null;
        if (!OooOOO().getMultiSelectedData().isEmpty()) {
            p118o00O0Oo0.OooO0O0 oooO0O1 = this.f22494OooO0o0;
            if (oooO0O1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
                oooO0O1 = null;
            }
            oooO0O1.f36580OooOO0.setClickable(true);
            p118o00O0Oo0.OooO0O0 oooO0O2 = this.f22494OooO0o0;
            if (oooO0O2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
                oooO0O2 = null;
            }
            p118o00O0Oo0.OooO0O0 oooO0O3 = this.f22494OooO0o0;
            if (oooO0O3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            } else {
                oooO0O0 = oooO0O3;
            }
            oooO0O0.f36580OooOO0.setTextColor(oooO0O2.f36586OooOOOo.f36556OooOOOO);
            return;
        }
        p118o00O0Oo0.OooO0O0 oooO0O4 = this.f22494OooO0o0;
        if (oooO0O4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooO0O4 = null;
        }
        oooO0O4.f36580OooOO0.setClickable(false);
        p118o00O0Oo0.OooO0O0 oooO0O5 = this.f22494OooO0o0;
        if (oooO0O5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooO0O5 = null;
        }
        p118o00O0Oo0.OooO0O0 oooO0O6 = this.f22494OooO0o0;
        if (oooO0O6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
        } else {
            oooO0O0 = oooO0O6;
        }
        oooO0O0.f36580OooOO0.setTextColor(oooO0O5.f36586OooOOOo.f36557OooOOOo);
    }

    public final void OooOOo0() {
        if (this.f22495OooO0oO.isEmpty()) {
            return;
        }
        AlbumSource albumSource = this.f22495OooO0oO.get(this.f22499OooOO0o);
        if (albumSource.getData().isEmpty()) {
            return;
        }
        p118o00O0Oo0.OooO0O0 oooO0O0 = this.f22494OooO0o0;
        o00000OO o00000oo2 = null;
        if (oooO0O0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooO0O0 = null;
        }
        String title = albumSource.getName() + "(" + albumSource.getData().size() + ")";
        oooO0O0.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        if (oooO0O0.f36576OooOOo) {
            if (!TextUtils.isEmpty(title)) {
                oooO0O0.f36581OooOO0O.setText(title);
            }
        } else if (TextUtils.isEmpty(title)) {
            oooO0O0.f36584OooOOO0.setVisibility(8);
        } else {
            oooO0O0.f36581OooOO0O.setVisibility(8);
            oooO0O0.f36582OooOO0o.setVisibility(0);
            oooO0O0.f36584OooOOO0.setVisibility(0);
            oooO0O0.f36584OooOOO0.setText(title);
        }
        o00000OO o00000oo3 = this.f22493OooO0o;
        if (o00000oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImagesRecyclerAdapter");
        } else {
            o00000oo2 = o00000oo3;
        }
        o00000oo2.setData(this.f22495OooO0oO.get(this.f22499OooOO0o).getData());
    }

    public final void OooOOoo(boolean z) {
        p118o00O0Oo0.OooO0O0 oooO0O0 = this.f22494OooO0o0;
        if (oooO0O0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooO0O0 = null;
        }
        oooO0O0.OooO0o(z);
        Object value = this.f22504OooOOo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-albumLayout>(...)");
        ((LinearLayout) value).setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ImagePicker.Companion companion = ImagePicker.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "application");
        companion.init(application, false);
        super.onCreate(bundle);
        setContentView(o0OO0.OooO0o.activity_all_images);
        this.f22498OooOO0O = getIntent().getIntExtra("MaxCount", 1);
        this.f22501OooOOO0 = getIntent().getBooleanExtra("IsClipPhoto", false);
        this.f22500OooOOO = getIntent().getFloatExtra("ClipWidthRatio", 1.0f);
        this.f22502OooOOOO = getIntent().getFloatExtra("ClipHeightRatio", 1.0f);
        this.f22503OooOOOo = getIntent().getBooleanExtra("IsSupportGifClip", false);
        boolean booleanExtra = getIntent().getBooleanExtra("IsTakePhoto", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("IsSupportGif", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("isSupportVideo", false);
        ArrayList<Uri> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("selectData");
        if (parcelableArrayListExtra != null) {
            this.f22496OooO0oo = parcelableArrayListExtra;
        }
        AlbumMultiMode albumMultiMode = this.f22498OooOO0O > 1 ? AlbumMultiMode.MODE_MULTI : AlbumMultiMode.MODE_SINGLE;
        YLAlbum yLAlbumCreate = YLAlbum.INSTANCE.create(this);
        Intrinsics.checkNotNullParameter(yLAlbumCreate, "<set-?>");
        this.f22497OooOO0 = yLAlbumCreate;
        AlbumQueryMode albumQueryMode = AlbumQueryMode.QUERY_STATIC_IMAGES_ONLY;
        if (booleanExtra3) {
            albumQueryMode = AlbumQueryMode.QUERY_ALL;
        } else if (booleanExtra2) {
            albumQueryMode = AlbumQueryMode.QUERY_IMAGES_ONLY;
        }
        Album albumOooOOO = OooOOO();
        int i = OooO.select_picture_string_All_photos;
        albumOooOOO.setMediaCategoryName("", getString(i), getString(i), getString(i), "");
        OooOOO().setConfig(new AlbumConfig(albumQueryMode, booleanExtra, albumMultiMode)).loadData(new o0OO00O(this));
        p118o00O0Oo0.OooO0O0 oooO0O0 = new p118o00O0Oo0.OooO0O0(this);
        this.f22494OooO0o0 = oooO0O0;
        oooO0O0.f36587OooOOo0 = new o00O0000(this);
        OooOOo();
        p118o00O0Oo0.OooO0O0 oooO0O1 = this.f22494OooO0o0;
        o00000OO o00000oo2 = null;
        if (oooO0O1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooO0O1 = null;
        }
        TextView textView = oooO0O1.f36580OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "mTitleInclude.rightTv");
        textView.setVisibility(this.f22498OooOO0O > 1 ? 0 : 8);
        o000000O o000000o2 = new o000000O(this, o0OO0.OooO0o.layout_image_file);
        o000000o2.f10098OooO0o = new o0OOO0o(this);
        Object value = this.f22506OooOOoo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-albumRv>(...)");
        RecyclerView recyclerView = (RecyclerView) value;
        if (o000000o2.f10113OooOo00 != null) {
            throw new RuntimeException("Don't bind twice");
        }
        o000000o2.f10113OooOo00 = recyclerView;
        recyclerView.setAdapter(o000000o2);
        Object value2 = this.f22504OooOOo.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-albumLayout>(...)");
        ((LinearLayout) value2).setOnClickListener(new OooOO0O(this, 1));
        this.f22493OooO0o = new o00000OO(this.f22498OooOO0O, OooOOO(), new o000OOo(this), new OooOOO(this));
        RecyclerView recyclerViewOooOOOO = OooOOOO();
        o00000OO o00000oo3 = this.f22493OooO0o;
        if (o00000oo3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImagesRecyclerAdapter");
        } else {
            o00000oo2 = o00000oo3;
        }
        recyclerViewOooOOOO.setAdapter(o00000oo2);
        OooOOOO().addItemDecoration(new o000000());
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        OooOOo();
        RecyclerView.Adapter adapter = OooOOOO().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }
}

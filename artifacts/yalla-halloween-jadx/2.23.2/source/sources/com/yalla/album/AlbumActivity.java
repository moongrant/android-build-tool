package com.yalla.album;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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
import com.yalla.album.AlbumActivity;
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
import o0OO0O0.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o000O00;
import p139o00OOOo0.OooOO0;
import p139o00OOOo0.OooOO0O;
import p141o00OOoo.OooOOO0;
import p361o0OOOooo.o00000OO;
import p361o0OOOooo.o0000O0;
import p361o0OOOooo.o0000O00;
import p361o0OOOooo.o0000OO0;
import p361o0OOOooo.o0000oo;
import p361o0OOOooo.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/album/AlbumActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "LibSelectPicture_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,370:1\n262#2,2:371\n262#2,2:395\n260#2:401\n1194#3,2:373\n1222#3,4:375\n766#3:379\n857#3,2:380\n1603#3,9:382\n1855#3:391\n1856#3:393\n1612#3:394\n1#4:392\n125#5:397\n152#5,3:398\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity\n*L\n130#1:371,2\n231#1:395,2\n126#1:401\n182#1:373,2\n182#1:375,4\n183#1:379\n183#1:380,2\n183#1:382,9\n183#1:391\n183#1:393\n183#1:394\n183#1:392\n365#1:397\n365#1:398,3\n*E\n"})
public final class AlbumActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f22018OooOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f22019OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000OO0 f22020OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOOO0 f22021OooO0o0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Album f22024OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f22026OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f22028OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f22030OooOOOo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public List<AlbumSource> f22022OooO0oO = new ArrayList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public ArrayList<Uri> f22023OooO0oo = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f22025OooOO0O = 1;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public float f22027OooOOO = 1.0f;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f22029OooOOOO = 1.0f;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f22032OooOOo0 = LazyKt.lazy(new OooO0o());

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f22031OooOOo = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f22033OooOOoo = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f22034OooOo00 = LazyKt.lazy(OooO0OO.f22037OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<LinearLayout> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final LinearLayout invoke() {
            return (LinearLayout) AlbumActivity.this.findViewById(o0OO0O0.OooO0OO.activity_all_images_listView_layout);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<RecyclerView> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return (RecyclerView) AlbumActivity.this.findViewById(o0OO0O0.OooO0OO.activity_all_images_listView);
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o000OO00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f22037OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO00 invoke() {
            return new o000OO00();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<RecyclerView> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return (RecyclerView) AlbumActivity.this.findViewById(o0OO0O0.OooO0OO.activity_all_images_recyclerView);
        }
    }

    public static final void OooOOO0(AlbumActivity activity, int i) {
        int i2 = activity.f22025OooOO0O;
        Intrinsics.checkNotNullParameter(activity, "activity");
        BigImageSelectActivity.f22042OooOOOO = new WeakReference<>(activity);
        Bundle bundle = new Bundle();
        bundle.putInt("MaxCount", i2);
        bundle.putInt("File_Index", i);
        Intent intent = new Intent(activity, (Class<?>) BigImageSelectActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    @NotNull
    public final Album OooOOO() {
        Album album = this.f22024OooOO0;
        if (album != null) {
            return album;
        }
        Intrinsics.throwUninitializedPropertyAccessException("album");
        return null;
    }

    @NotNull
    public final RecyclerView OooOOOO() {
        Object value = this.f22032OooOOo0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
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
        selectImageData.f12876OooO0Oo = new ArrayList<>(arrayList);
        Function1<? super SelectImageData, Unit> function1 = OooOO0O.f37477OooO00o;
        if (function1 != null) {
            function1.invoke(selectImageData);
        }
        OooOO0O.f37477OooO00o = null;
        finish();
    }

    public final void OooOOo() {
        OooOOO0 oooOOO0 = null;
        if (!OooOOO().getMultiSelectedData().isEmpty()) {
            OooOOO0 oooOOO1 = this.f22021OooO0o0;
            if (oooOOO1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
                oooOOO1 = null;
            }
            oooOOO1.f37517OooOO0.setClickable(true);
            OooOOO0 oooOOO2 = this.f22021OooO0o0;
            if (oooOOO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
                oooOOO2 = null;
            }
            OooOOO0 oooOOO3 = this.f22021OooO0o0;
            if (oooOOO3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            } else {
                oooOOO0 = oooOOO3;
            }
            oooOOO0.f37517OooOO0.setTextColor(oooOOO2.f37523OooOOOo.f37493OooOOOO);
            return;
        }
        OooOOO0 oooOOO4 = this.f22021OooO0o0;
        if (oooOOO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooOOO4 = null;
        }
        oooOOO4.f37517OooOO0.setClickable(false);
        OooOOO0 oooOOO5 = this.f22021OooO0o0;
        if (oooOOO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooOOO5 = null;
        }
        OooOOO0 oooOOO6 = this.f22021OooO0o0;
        if (oooOOO6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
        } else {
            oooOOO0 = oooOOO6;
        }
        oooOOO0.f37517OooOO0.setTextColor(oooOOO5.f37523OooOOOo.f37494OooOOOo);
    }

    public final void OooOOo0() {
        if (this.f22022OooO0oO.isEmpty()) {
            return;
        }
        AlbumSource albumSource = this.f22022OooO0oO.get(this.f22026OooOO0o);
        if (albumSource.getData().isEmpty()) {
            return;
        }
        OooOOO0 oooOOO0 = this.f22021OooO0o0;
        o0000OO0 o0000oo1 = null;
        if (oooOOO0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooOOO0 = null;
        }
        String title = albumSource.getName() + "(" + albumSource.getData().size() + ")";
        oooOOO0.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        if (oooOOO0.f37513OooOOo) {
            if (!TextUtils.isEmpty(title)) {
                oooOOO0.f37518OooOO0O.setText(title);
            }
        } else if (TextUtils.isEmpty(title)) {
            oooOOO0.f37521OooOOO0.setVisibility(8);
        } else {
            oooOOO0.f37518OooOO0O.setVisibility(8);
            oooOOO0.f37519OooOO0o.setVisibility(0);
            oooOOO0.f37521OooOOO0.setVisibility(0);
            oooOOO0.f37521OooOOO0.setText(title);
        }
        o0000OO0 o0000oo2 = this.f22020OooO0o;
        if (o0000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImagesRecyclerAdapter");
        } else {
            o0000oo1 = o0000oo2;
        }
        o0000oo1.setData(this.f22022OooO0oO.get(this.f22026OooOO0o).getData());
    }

    public final void OooOOoo(boolean z) {
        OooOOO0 oooOOO0 = this.f22021OooO0o0;
        if (oooOOO0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooOOO0 = null;
        }
        oooOOO0.OooO0o(z);
        Object value = this.f22031OooOOo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((LinearLayout) value).setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        ImagePicker.Companion companion = ImagePicker.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        companion.init(application, false);
        super.onCreate(bundle);
        setContentView(o0OO0O0.OooO0o.activity_all_images);
        this.f22025OooOO0O = getIntent().getIntExtra("MaxCount", 1);
        this.f22028OooOOO0 = getIntent().getBooleanExtra("IsClipPhoto", false);
        this.f22027OooOOO = getIntent().getFloatExtra("ClipWidthRatio", 1.0f);
        this.f22029OooOOOO = getIntent().getFloatExtra("ClipHeightRatio", 1.0f);
        this.f22030OooOOOo = getIntent().getBooleanExtra("IsSupportGifClip", false);
        boolean booleanExtra = getIntent().getBooleanExtra("IsTakePhoto", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("IsSupportGif", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("isSupportVideo", false);
        ArrayList<Uri> parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("selectData");
        if (parcelableArrayListExtra != null) {
            this.f22023OooO0oo = parcelableArrayListExtra;
        }
        AlbumMultiMode albumMultiMode = this.f22025OooOO0O > 1 ? AlbumMultiMode.MODE_MULTI : AlbumMultiMode.MODE_SINGLE;
        YLAlbum yLAlbumCreate = YLAlbum.INSTANCE.create(this);
        Intrinsics.checkNotNullParameter(yLAlbumCreate, "<set-?>");
        this.f22024OooOO0 = yLAlbumCreate;
        AlbumQueryMode albumQueryMode = AlbumQueryMode.QUERY_STATIC_IMAGES_ONLY;
        if (booleanExtra3) {
            albumQueryMode = AlbumQueryMode.QUERY_ALL;
        } else if (booleanExtra2) {
            albumQueryMode = AlbumQueryMode.QUERY_IMAGES_ONLY;
        }
        Album albumOooOOO = OooOOO();
        int i = OooO.select_picture_string_All_photos;
        albumOooOOO.setMediaCategoryName("", getString(i), getString(i), getString(i), "");
        OooOOO().setConfig(new AlbumConfig(albumQueryMode, booleanExtra, albumMultiMode)).loadData(new o00000OO(this));
        OooOOO0 oooOOO0 = new OooOOO0(this);
        this.f22021OooO0o0 = oooOOO0;
        oooOOO0.f37524OooOOo0 = new p138o00OOOo.OooO0OO() { // from class: o0OOOooo.o00000O0
            @Override // p138o00OOOo.OooO0OO
            public final void OooO00o(View view, Integer num) {
                int i2 = AlbumActivity.f22018OooOo0;
                AlbumActivity this$0 = this.f42954OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (num != null && num.intValue() == 1010) {
                    if (this$0.f22025OooOO0O == 9) {
                        if (OooOO0.f37475OooO0Oo == null) {
                            OooOO0.f37475OooO0Oo = new p139o00OOOo0.OooO();
                        }
                        OooOO0.f37475OooO0Oo.OooO00o("Moments_post_pic_cancel");
                    }
                    this$0.onBackPressed();
                    return;
                }
                if (num != null && num.intValue() == 1011) {
                    if (this$0.f22025OooOO0O == 9) {
                        if (OooOO0.f37475OooO0Oo == null) {
                            OooOO0.f37475OooO0Oo = new p139o00OOOo0.OooO();
                        }
                        OooOO0.f37475OooO0Oo.OooO00o("Moments_post_pic_success");
                    }
                    this$0.OooOOOo();
                    return;
                }
                if ((num != null && num.intValue() == 1012) || (num != null && num.intValue() == 1013)) {
                    Object value = this$0.f22031OooOOo.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    this$0.OooOOoo(!(((LinearLayout) value).getVisibility() == 0));
                }
            }
        };
        OooOOo();
        OooOOO0 oooOOO1 = this.f22021OooO0o0;
        o0000OO0 o0000oo1 = null;
        if (oooOOO1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleInclude");
            oooOOO1 = null;
        }
        TextView textView = oooOOO1.f37517OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "getRightTv(...)");
        textView.setVisibility(this.f22025OooOO0O > 1 ? 0 : 8);
        o0000O0 o0000o1 = new o0000O0(this, o0OO0O0.OooO0o.layout_image_file);
        o0000o1.f13176OooO0o = new o000O00(this);
        Object value = this.f22033OooOOoo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        RecyclerView recyclerView = (RecyclerView) value;
        if (o0000o1.f13191OooOo00 != null) {
            throw new RuntimeException("Don't bind twice");
        }
        o0000o1.f13191OooOo00 = recyclerView;
        recyclerView.setAdapter(o0000o1);
        Object value2 = this.f22031OooOOo.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        ((LinearLayout) value2).setOnClickListener(new View.OnClickListener() { // from class: o0OOOooo.o00000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = AlbumActivity.f22018OooOo0;
                AlbumActivity this$0 = this.f42952OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOOoo(false);
            }
        });
        this.f22020OooO0o = new o0000OO0(this.f22025OooOO0O, OooOOO(), new o0000O00(this), new androidx.media3.session.o00000OO(this));
        RecyclerView recyclerViewOooOOOO = OooOOOO();
        o0000OO0 o0000oo2 = this.f22020OooO0o;
        if (o0000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImagesRecyclerAdapter");
        } else {
            o0000oo1 = o0000oo2;
        }
        recyclerViewOooOOOO.setAdapter(o0000oo1);
        OooOOOO().addItemDecoration(new o0000oo());
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

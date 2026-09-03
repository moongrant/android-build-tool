package p361o0OOOooo;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.compose.ui.graphics.colorspace.OooOo00;
import androidx.fragment.app.FragmentActivity;
import com.app.selectPicture.model.SelectImageData;
import com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener;
import com.common.support.imagepicker.dataprovider.entities.AlbumItem;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.common.support.imagepicker.mediaedit.utils.ImageUtils;
import com.yalla.album.AlbumActivity;
import java.io.File;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p139o00OOOo0.OooOO0;
import p142o00OOooO.OooOO0O;
import p143o00OOooo.OooOOO;
import p143o00OOooo.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitGridView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitGridView$1\n*L\n241#1:371\n241#1:372,3\n*E\n"})
public final class o0000O00 implements AlbumAdapterItemClickListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AlbumActivity f42958OooO00o;

    public o0000O00(AlbumActivity albumActivity) {
        this.f42958OooO00o = albumActivity;
    }

    @Override // com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener
    public final void onMultiModeItemClick(int i, @NotNull AlbumItemWrapper source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AlbumActivity.OooOOO0(this.f42958OooO00o, i);
    }

    @Override // com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener
    public final void onSingleModeItemClick(int i, @NotNull AlbumItemWrapper source) {
        Object objM4215constructorimpl;
        OutputStream outputStreamOpenOutputStream;
        Intrinsics.checkNotNullParameter(source, "source");
        boolean zIsVideo = source.getOriginItem().isVideo();
        final AlbumActivity albumActivity = this.f42958OooO00o;
        if (zIsVideo) {
            AlbumItem originItem = source.getOriginItem();
            int i2 = AlbumActivity.f22018OooOo0;
            albumActivity.getClass();
            if (OooOO0.f37474OooO0OO == null) {
                OooOO0.f37474OooO0OO = new OooOo00();
            }
            OooOO0.f37474OooO0OO.OooO00o(albumActivity, originItem);
            return;
        }
        if (!albumActivity.f22028OooOOO0) {
            AlbumActivity.OooOOO0(albumActivity, i);
            return;
        }
        AlbumItem originItem2 = source.getOriginItem();
        ((o000OO00) albumActivity.f22034OooOo00.getValue()).getClass();
        if (o000OO00.OooO00o(albumActivity, originItem2).booleanValue()) {
            return;
        }
        if (!originItem2.isGif() || !albumActivity.f22028OooOOO0 || !albumActivity.f22030OooOOOo) {
            o0O0ooO.OooO00o(albumActivity, originItem2.getContentUri(), albumActivity.f22027OooOOO, albumActivity.f22029OooOOOO, originItem2.getWidth(), originItem2.getHeight(), new OooOO0O() { // from class: o0OOOooo.o00000O
                @Override // p142o00OOooO.OooOO0O
                public final void onActivityResult(int i3, Intent intent) {
                    int i4 = AlbumActivity.f22018OooOo0;
                    AlbumActivity this$0 = albumActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (i3 != -1 || intent == null) {
                        return;
                    }
                    SelectImageData selectImageData = new SelectImageData();
                    Uri data = intent.getData();
                    selectImageData.OooO00o().clear();
                    selectImageData.OooO00o().add(data);
                    intent.putExtra("selectData", selectImageData);
                    Function1<? super SelectImageData, Unit> function1 = p139o00OOOo0.OooOO0O.f37477OooO00o;
                    if (function1 != null) {
                        function1.invoke(selectImageData);
                    }
                    p139o00OOOo0.OooOO0O.f37477OooO00o = null;
                    this$0.finish();
                }
            });
            return;
        }
        Bitmap bitmapByGif = ImageUtils.INSTANCE.getBitmapByGif(source);
        if (bitmapByGif == null) {
            SelectImageData selectImageData = new SelectImageData();
            Uri contentUri = originItem2.getContentUri();
            selectImageData.OooO00o().clear();
            selectImageData.OooO00o().add(contentUri);
            Function1<? super SelectImageData, Unit> function1 = p139o00OOOo0.OooOO0O.f37477OooO00o;
            if (function1 != null) {
                function1.invoke(selectImageData);
            }
            p139o00OOOo0.OooOO0O.f37477OooO00o = null;
            albumActivity.finish();
            return;
        }
        Uri uriOooO00o = OooOOO.OooO00o(albumActivity);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (uriOooO00o != null && (outputStreamOpenOutputStream = albumActivity.getContentResolver().openOutputStream(uriOooO00o)) != null) {
                bitmapByGif.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.flush();
                outputStreamOpenOutputStream.close();
            }
            objM4215constructorimpl = Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m4222isSuccessimpl(objM4215constructorimpl)) {
            o0O0ooO.OooO00o(albumActivity, uriOooO00o, albumActivity.f22027OooOOO, albumActivity.f22029OooOOOO, bitmapByGif.getWidth(), bitmapByGif.getHeight(), new OooOO0O() { // from class: o0OOOooo.o00000O
                @Override // p142o00OOooO.OooOO0O
                public final void onActivityResult(int i3, Intent intent) {
                    int i4 = AlbumActivity.f22018OooOo0;
                    AlbumActivity this$0 = albumActivity;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (i3 != -1 || intent == null) {
                        return;
                    }
                    SelectImageData selectImageData2 = new SelectImageData();
                    Uri data = intent.getData();
                    selectImageData2.OooO00o().clear();
                    selectImageData2.OooO00o().add(data);
                    intent.putExtra("selectData", selectImageData2);
                    Function1<? super SelectImageData, Unit> function2 = p139o00OOOo0.OooOO0O.f37477OooO00o;
                    if (function2 != null) {
                        function2.invoke(selectImageData2);
                    }
                    p139o00OOOo0.OooOO0O.f37477OooO00o = null;
                    this$0.finish();
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [o0OOOooo.o0000] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o0OOOooo.o0000Ooo] */
    @Override // com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener
    public final void openCamera() {
        final AlbumActivity context = this.f42958OooO00o;
        final boolean z = context.f22028OooOOO0;
        final float f = context.f22027OooOOO;
        final float f2 = context.f22029OooOOOO;
        final ?? r8 = new OooOO0O() { // from class: o0OOOooo.o0000Ooo
            @Override // p142o00OOooO.OooOO0O
            public final void onActivityResult(int i, Intent intent) {
                AlbumActivity this$0 = context;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != -1 || intent == null || intent.getData() == null) {
                    return;
                }
                Uri data = intent.getData();
                Intrinsics.checkNotNull(data);
                if (data.getPath() != null) {
                    SelectImageData selectImageData = new SelectImageData();
                    Collection<AlbumItemWrapper> collectionValues = this$0.OooOOO().getMultiSelectedData().values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                    Collection<AlbumItemWrapper> collection = collectionValues;
                    ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(collection));
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AlbumItemWrapper) it.next()).getOriginItem().getContentUri());
                    }
                    ArrayList<Uri> arrayList2 = new ArrayList<>(arrayList);
                    arrayList2.add(intent.getData());
                    selectImageData.f12876OooO0Oo = arrayList2;
                    intent.putExtra("selectData", selectImageData);
                    this$0.setResult(i, intent);
                    Function1<? super SelectImageData, Unit> function1 = p139o00OOOo0.OooOO0O.f37477OooO00o;
                    if (function1 != null) {
                        function1.invoke(selectImageData);
                    }
                    p139o00OOOo0.OooOO0O.f37477OooO00o = null;
                    this$0.finish();
                }
            }
        };
        final ?? r7 = new OooOO0O() { // from class: o0OOOooo.o0000
            @Override // p142o00OOooO.OooOO0O
            public final void onActivityResult(int i, Intent intent) {
                AlbumActivity this$0 = context;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (i != -1 || intent == null) {
                    return;
                }
                SelectImageData selectImageData = new SelectImageData();
                Uri data = intent.getData();
                selectImageData.OooO00o().clear();
                selectImageData.OooO00o().add(data);
                intent.putExtra("selectData", selectImageData);
                this$0.setResult(i, intent);
                Function1<? super SelectImageData, Unit> function1 = p139o00OOOo0.OooOO0O.f37477OooO00o;
                if (function1 != null) {
                    function1.invoke(selectImageData);
                }
                p139o00OOOo0.OooOO0O.f37477OooO00o = null;
                this$0.finish();
            }
        };
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.camera.any") || packageManager.hasSystemFeature("android.hardware.camera.front")) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Uri uriOooO00o = OooOOO.OooO00o(context);
            final String strOooO0O0 = OooOOO.OooO0O0(context, uriOooO00o);
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriOooO00o);
            intent.addFlags(2);
            intent.putExtra("android.intent.extra.videoQuality", 1);
            p142o00OOooO.OooOO0 oooOO1 = new p142o00OOooO.OooOO0(context);
            oooOO1.f37527OooO0O0 = intent;
            oooOO1.OooO00o(new OooOO0O() { // from class: o0OOOooo.o00O0000
                /* JADX INFO: Removed unreachable split cross block B:52:0x0044 */
                @Override // p142o00OOooO.OooOO0O
                public final void onActivityResult(int i, Intent intent2) {
                    Uri uriOooO0O0;
                    Uri uri = uriOooO00o;
                    float f3 = f;
                    float f4 = f2;
                    OooOO0O oooOO0O = r7;
                    FragmentActivity mContext = context;
                    if (i != -1) {
                        try {
                            OooOOO0.OooO00o(mContext, uri);
                            return;
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                    Application application = mContext.getApplication();
                    if (application != null) {
                        String str = strOooO0O0;
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                try {
                                    Uri uriFromFile = Uri.fromFile(new File(str));
                                    if (uriFromFile != null) {
                                        try {
                                            Intent intent3 = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                                            intent3.setData(uriFromFile);
                                            application.sendBroadcast(intent3);
                                        } catch (Exception e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                } catch (Exception e3) {
                                    e3.printStackTrace();
                                }
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                    }
                    if (!z) {
                        OooOO0O oooOO0O2 = r8;
                        if (oooOO0O2 != null) {
                            if (intent2 == null) {
                                intent2 = new Intent();
                            }
                            intent2.setAction(null);
                            intent2.setData(uri);
                            oooOO0O2.onActivityResult(i, intent2);
                            return;
                        }
                        return;
                    }
                    String imagePath = OooOOO.OooO0O0(mContext, uri);
                    Intrinsics.checkNotNullParameter(mContext, "mContext");
                    Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    try {
                        options.inJustDecodeBounds = true;
                        if (Build.VERSION.SDK_INT < 29 || (uriOooO0O0 = OooOOO0.OooO00o.OooO0O0(mContext, imagePath)) == null) {
                            BitmapFactory.decodeFile(imagePath, options);
                        } else {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = mContext.getContentResolver().openFileDescriptor(uriOooO0O0, "r");
                            Intrinsics.checkNotNull(parcelFileDescriptorOpenFileDescriptor);
                            BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    o0O0ooO.OooO00o(mContext, uri, f3, f4, options.outWidth, options.outHeight, oooOO0O);
                }
            });
        }
    }
}

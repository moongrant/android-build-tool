package p358o0OOOooO;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.compose.material.OooOOO0;
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
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o00O0OO.OooO0OO;
import o00O0OO.OooO0o;
import oo0oOO0.OooO0O0;
import org.jetbrains.annotations.NotNull;
import p117o00O0Oo.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nAlbumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitGridView$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 AlbumActivity.kt\ncom/yalla/album/AlbumActivity$onInitGridView$1\n*L\n241#1:371\n241#1:372,3\n*E\n"})
public final class o000OOo implements AlbumAdapterItemClickListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AlbumActivity f43808OooO00o;

    public o000OOo(AlbumActivity albumActivity) {
        this.f43808OooO00o = albumActivity;
    }

    @Override // com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener
    public final void onMultiModeItemClick(int i, @NotNull AlbumItemWrapper source) {
        Intrinsics.checkNotNullParameter(source, "source");
        AlbumActivity.OooOOO0(this.f43808OooO00o, i);
    }

    @Override // com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener
    public final void onSingleModeItemClick(int i, @NotNull AlbumItemWrapper source) {
        Object objM4213constructorimpl;
        OutputStream outputStreamOpenOutputStream;
        Intrinsics.checkNotNullParameter(source, "source");
        boolean zIsVideo = source.getOriginItem().isVideo();
        final AlbumActivity albumActivity = this.f43808OooO00o;
        if (zIsVideo) {
            AlbumItem originItem = source.getOriginItem();
            int i2 = AlbumActivity.f22491OooOo0;
            albumActivity.getClass();
            if (OooO0OO.f36537OooO0OO == null) {
                OooO0OO.f36537OooO0OO = new OooOOO0();
            }
            OooO0OO.f36537OooO0OO.OooO00o(albumActivity, originItem);
            return;
        }
        if (!albumActivity.f22501OooOOO0) {
            AlbumActivity.OooOOO0(albumActivity, i);
            return;
        }
        AlbumItem originItem2 = source.getOriginItem();
        ((o000O0o) albumActivity.f22507OooOo00.getValue()).getClass();
        if (o000O0o.OooO00o(albumActivity, originItem2).booleanValue()) {
            return;
        }
        if (!originItem2.isGif() || !albumActivity.f22501OooOOO0 || !albumActivity.f22503OooOOOo) {
            o000O0.OooO00o(albumActivity, originItem2.getContentUri(), albumActivity.f22500OooOOO, albumActivity.f22502OooOOOO, originItem2.getWidth(), originItem2.getHeight(), new oo0oOO0.OooO0OO() { // from class: o0OOOooO.o0Oo0oo
                @Override // oo0oOO0.OooO0OO
                public final void onActivityResult(int i3, Intent intent) {
                    int i4 = AlbumActivity.f22491OooOo0;
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
                    Function1<? super SelectImageData, Unit> function1 = OooO0o.f36540OooO00o;
                    if (function1 != null) {
                        function1.invoke(selectImageData);
                    }
                    OooO0o.f36540OooO00o = null;
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
            Function1<? super SelectImageData, Unit> function1 = OooO0o.f36540OooO00o;
            if (function1 != null) {
                function1.invoke(selectImageData);
            }
            OooO0o.f36540OooO00o = null;
            albumActivity.finish();
            return;
        }
        Uri uriOooO00o = p117o00O0Oo.OooOOO0.OooO00o(albumActivity);
        try {
            Result.Companion companion = Result.INSTANCE;
            if (uriOooO00o != null && (outputStreamOpenOutputStream = albumActivity.getContentResolver().openOutputStream(uriOooO00o)) != null) {
                bitmapByGif.compress(Bitmap.CompressFormat.PNG, 100, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.flush();
                outputStreamOpenOutputStream.close();
            }
            objM4213constructorimpl = Result.m4213constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4213constructorimpl = Result.m4213constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m4220isSuccessimpl(objM4213constructorimpl)) {
            o000O0.OooO00o(albumActivity, uriOooO00o, albumActivity.f22500OooOOO, albumActivity.f22502OooOOOO, bitmapByGif.getWidth(), bitmapByGif.getHeight(), new oo0oOO0.OooO0OO() { // from class: o0OOOooO.o0Oo0oo
                @Override // oo0oOO0.OooO0OO
                public final void onActivityResult(int i3, Intent intent) {
                    int i4 = AlbumActivity.f22491OooOo0;
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
                    Function1<? super SelectImageData, Unit> function2 = OooO0o.f36540OooO00o;
                    if (function2 != null) {
                        function2.invoke(selectImageData2);
                    }
                    OooO0o.f36540OooO00o = null;
                    this$0.finish();
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [o0OOOooO.o0O0O00] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o0OOOooO.oo0o0Oo] */
    @Override // com.common.support.imagepicker.album.adapter.AlbumAdapterItemClickListener
    public final void openCamera() {
        final AlbumActivity context = this.f43808OooO00o;
        final boolean z = context.f22501OooOOO0;
        final float f = context.f22500OooOOO;
        final float f2 = context.f22502OooOOOO;
        final ?? r8 = new oo0oOO0.OooO0OO() { // from class: o0OOOooO.oo0o0Oo
            @Override // oo0oOO0.OooO0OO
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
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "album.getMultiSelectedData().values");
                    Collection<AlbumItemWrapper> collection = collectionValues;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AlbumItemWrapper) it.next()).getOriginItem().getContentUri());
                    }
                    ArrayList<Uri> arrayList2 = new ArrayList<>(arrayList);
                    arrayList2.add(intent.getData());
                    selectImageData.f9785OooO0Oo = arrayList2;
                    intent.putExtra("selectData", selectImageData);
                    this$0.setResult(i, intent);
                    Function1<? super SelectImageData, Unit> function1 = OooO0o.f36540OooO00o;
                    if (function1 != null) {
                        function1.invoke(selectImageData);
                    }
                    OooO0o.f36540OooO00o = null;
                    this$0.finish();
                }
            }
        };
        final ?? r7 = new oo0oOO0.OooO0OO() { // from class: o0OOOooO.o0O0O00
            @Override // oo0oOO0.OooO0OO
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
                Function1<? super SelectImageData, Unit> function1 = OooO0o.f36540OooO00o;
                if (function1 != null) {
                    function1.invoke(selectImageData);
                }
                OooO0o.f36540OooO00o = null;
                this$0.finish();
            }
        };
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("android.hardware.camera.any") || packageManager.hasSystemFeature("android.hardware.camera.front")) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Uri uriOooO00o = p117o00O0Oo.OooOOO0.OooO00o(context);
            final String strOooO0O0 = p117o00O0Oo.OooOOO0.OooO0O0(context, uriOooO00o);
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriOooO00o);
            intent.addFlags(2);
            intent.putExtra("android.intent.extra.videoQuality", 1);
            OooO0O0 oooO0O0 = new OooO0O0(context);
            oooO0O0.f60908OooO0O0 = intent;
            oooO0O0.OooO00o(new oo0oOO0.OooO0OO() { // from class: o0OOOooO.o000O00O
                /* JADX INFO: Removed unreachable split cross block B:52:0x0044 */
                @Override // oo0oOO0.OooO0OO
                public final void onActivityResult(int i, Intent intent2) {
                    Uri uriOooO0O0;
                    Uri uri = uriOooO00o;
                    float f3 = f;
                    float f4 = f2;
                    oo0oOO0.OooO0OO oooO0OO = r7;
                    FragmentActivity mContext = context;
                    if (i != -1) {
                        try {
                            OooOO0O.OooO00o(mContext, uri);
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
                        oo0oOO0.OooO0OO oooO0OO2 = r8;
                        if (oooO0OO2 != null) {
                            if (intent2 == null) {
                                intent2 = new Intent();
                            }
                            intent2.setAction(null);
                            intent2.setData(uri);
                            oooO0OO2.onActivityResult(i, intent2);
                            return;
                        }
                        return;
                    }
                    String imagePath = p117o00O0Oo.OooOOO0.OooO0O0(mContext, uri);
                    Intrinsics.checkNotNullParameter(mContext, "mContext");
                    Intrinsics.checkNotNullParameter(imagePath, "imagePath");
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    try {
                        options.inJustDecodeBounds = true;
                        if (Build.VERSION.SDK_INT < 29 || (uriOooO0O0 = OooOO0O.OooO00o.OooO0O0(mContext, imagePath)) == null) {
                            BitmapFactory.decodeFile(imagePath, options);
                        } else {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = mContext.getContentResolver().openFileDescriptor(uriOooO0O0, "r");
                            Intrinsics.checkNotNull(parcelFileDescriptorOpenFileDescriptor);
                            BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    o000O0.OooO00o(mContext, uri, f3, f4, options.outWidth, options.outHeight, oooO0OO);
                }
            });
        }
    }
}

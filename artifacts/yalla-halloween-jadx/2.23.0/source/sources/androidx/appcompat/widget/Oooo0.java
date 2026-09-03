package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class Oooo0 {
    @DoNotInline
    public static boolean OooO00o(@NonNull DragEvent dragEvent, @NonNull TextView textView, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            ViewCompat.OooOO0O(textView, (Build.VERSION.SDK_INT >= 31 ? new ContentInfoCompat.OooO00o(clipData, 3) : new ContentInfoCompat.OooO0OO(clipData, 3)).build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    @DoNotInline
    public static boolean OooO0O0(@NonNull DragEvent dragEvent, @NonNull View view, @NonNull Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        ViewCompat.OooOO0O(view, (Build.VERSION.SDK_INT >= 31 ? new ContentInfoCompat.OooO00o(clipData, 3) : new ContentInfoCompat.OooO0OO(clipData, 3)).build());
        return true;
    }
}

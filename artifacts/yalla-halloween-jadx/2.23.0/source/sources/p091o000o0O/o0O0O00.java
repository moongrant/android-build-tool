package p091o000o0O;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.facebook.appevents.internal.ViewHierarchyConstants;

/* JADX INFO: loaded from: classes2.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = o0Oo0oo.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {ViewHierarchyConstants.TAG_KEY, "work_spec_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = ViewHierarchyConstants.TAG_KEY)
    public final String f35256OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    @ColumnInfo(name = "work_spec_id")
    public final String f35257OooO0O0;

    public o0O0O00(@NonNull String str, @NonNull String str2) {
        this.f35256OooO00o = str;
        this.f35257OooO0O0 = str2;
    }
}

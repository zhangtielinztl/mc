package com.mc.mapper;

        import com.mc.pojo.TbHealthIndex;

        import java.util.List;

public interface TbHealthIndexMapper {
    List<TbHealthIndex> getTbHealthIndex();
    void addTbHealthIndex(TbHealthIndex healthIndex);
}

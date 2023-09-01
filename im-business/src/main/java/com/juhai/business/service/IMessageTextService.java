package com.juhai.business.service;

import java.util.List;
import com.juhai.business.domain.MessageText;

/**
 * 文本列表Service接口
 * 
 * @author zhaotiezhu
 * @date 2023-09-01
 */
public interface IMessageTextService 
{
    /**
     * 查询文本列表
     * 
     * @param id 文本列表主键
     * @return 文本列表
     */
    public MessageText selectMessageTextById(Long id);

    /**
     * 查询文本列表列表
     * 
     * @param messageText 文本列表
     * @return 文本列表集合
     */
    public List<MessageText> selectMessageTextList(MessageText messageText);

    /**
     * 新增文本列表
     * 
     * @param messageText 文本列表
     * @return 结果
     */
    public int insertMessageText(MessageText messageText);

    /**
     * 修改文本列表
     * 
     * @param messageText 文本列表
     * @return 结果
     */
    public int updateMessageText(MessageText messageText);

    /**
     * 批量删除文本列表
     * 
     * @param ids 需要删除的文本列表主键集合
     * @return 结果
     */
    public int deleteMessageTextByIds(Long[] ids);

    /**
     * 删除文本列表信息
     * 
     * @param id 文本列表主键
     * @return 结果
     */
    public int deleteMessageTextById(Long id);
}

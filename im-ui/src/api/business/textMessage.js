import request from '@/utils/request'

// 查询文本列表列表
export function listText(query) {
  return request({
    url: '/business/text/list',
    method: 'get',
    params: query
  })
}

// 查询文本列表详细
export function getText(id) {
  return request({
    url: '/business/text/' + id,
    method: 'get'
  })
}

// 新增文本列表
export function addText(data) {
  return request({
    url: '/business/text',
    method: 'post',
    data: data
  })
}

// 修改文本列表
export function updateText(data) {
  return request({
    url: '/business/text',
    method: 'put',
    data: data
  })
}

// 删除文本列表
export function delText(id) {
  return request({
    url: '/business/text/' + id,
    method: 'delete'
  })
}

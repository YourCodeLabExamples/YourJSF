/**
 * Passa os dados do cliente para o Modal, e atualiza o link para exclusão
 */
$('#delete-modal').on('show.bs.modal', function (event) {
  var modal = $(this);
  
  modal.find('.modal-title').text('Confirmar Exclusão');
})
